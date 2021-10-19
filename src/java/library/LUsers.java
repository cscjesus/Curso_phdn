/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import org.hibernate.Transaction;
import org.hibernate.Session;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import models.HibernateUtil;
import models.User;
import org.hibernate.SessionFactory;
import validators.Encrypt;

/**
 *
 * @author liz
 */
public class LUsers {

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
    public boolean registrar(User user, HttpServletRequest request){
        try {
            
            session();
            tx=session.beginTransaction();
            miSession =request.getSession(true);
            String pass = Encrypt.encrypt(user.getPassword());
            user.setPassword(pass);
            user.setLastLogin(date);
            user.setIsActive(true);
            user.setDateJoined(date);
            user.setUsername(user.getFirstName());
            user.setIsSuper(false);
            
        } catch (Exception e) {
            
        }
        return false;
    }

}
/*
https://www.baeldung.com/java-date-to-localdate-and-localdatetime
*/
