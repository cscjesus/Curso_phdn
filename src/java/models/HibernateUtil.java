/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Lichi
 */
public class HibernateUtil {

    //private static final SessionFactory sessionFactory;
    private static  SessionFactory sessionFactory;
    
//    static {
//        try {
//            // Create the SessionFactory from standard (hibernate.cfg.xml) 
//            // config file.
//            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
//        } catch (Throwable ex) {
//            // Log the exception. 
//            System.err.println("Initial SessionFactory creation failed." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
    
    public static SessionFactory getSessionFactory() {
        if(sessionFactory==null){
            //Una instancia de Configuration permite que la aplicacion especifique las propiedades
            // y los documentos de mapero que se utilizaran al crear una SessionFactory
            Configuration configuration = new Configuration().configure();
            StandardServiceRegistry serviceRegistry
                    =new StandardServiceRegistryBuilder().
                            applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            
        }
        return sessionFactory;
    }
}
