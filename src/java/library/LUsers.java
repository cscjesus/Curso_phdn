/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import consult.Consult;
import org.hibernate.Transaction;
import org.hibernate.Session;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import models.HibernateUtil;
import models.User;
import models.UserData;
import org.hibernate.SessionFactory;
import validators.Encrypt;

/**
 *
 * @author liz
 */
public class LUsers extends Consult {

    private Session session;
    private Transaction tx = null;
    private final Date date;
    private HttpSession miSession;

    public LUsers() {
        this.date = new Date();
    }

    private void session() {
        SessionFactory sessionFactory
                = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public boolean registrar(User user, HttpServletRequest request) {
        try {
            List<User> listUser = listUsers().stream().filter(u -> u.getEmail().equals(user.getEmail()))
                    .collect(Collectors.toList());

            if (listUser.isEmpty()) {
                session();
                tx = session.beginTransaction();
                miSession = request.getSession(true);
                String pass = Encrypt.encrypt(user.getPassword());
                user.setPassword(pass);
                user.setLastLogin(date);
                user.setIsActive(true);
                user.setDateJoined(date);
                user.setUsername(user.getFirstName());
                user.setIsSuper(false);
                session.save(user);//guardar usuario en la bd
                tx.commit();
                miSession.setAttribute("user", new UserData(
                        user.getFirstName(), user.getLastName(),
                        user.getEmail(), user.getUsername()));
                return true;
            }else{
                return false;
            }

        } catch (Exception e) {
            tx.rollback();
        }
        return false;
    }

}
/*
https://www.baeldung.com/java-date-to-localdate-and-localdatetime
 */
