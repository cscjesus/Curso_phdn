/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consult;

import java.util.List;
import models.HibernateUtil;
import models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;

/**
 *
 * @author liz
 */
public class Consult {

    private Session session;

    private void session() {
        SessionFactory sessionFactory
                = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }
    
    public List<User> listUsers(){
        session();
        Query query = session.createQuery("from User");//User modelo, no tabla
        return query.list();
    }
}
