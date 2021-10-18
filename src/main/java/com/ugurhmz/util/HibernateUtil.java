package com.ugurhmz.util;

/*
*   Singleton Design Pattern ( Nesneyi sadece 1 kez oluştur, Her yerde kullan)
*
* */

import com.ugurhmz.model.FirstEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private final static SessionFactory sessionFactory  = buidSessionFactory();



    // buildSessionFactory
    private static SessionFactory buidSessionFactory(){
        try {
            Configuration cfg = new Configuration();


            cfg.addAnnotatedClass(FirstEntity.class);
            SessionFactory sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();

            return sessionFactory;

        } catch(Exception ex) {
            System.out.println("SessionFactory Err : "+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    //getSessionFactory
    public static  SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
