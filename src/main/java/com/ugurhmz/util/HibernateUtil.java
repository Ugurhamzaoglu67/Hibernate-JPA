package com.ugurhmz.util;

/*
*   Singleton Design Pattern ( Nesneyi sadece 1 kez oluştur, Her yerde kullan)
*
* */

import com.ugurhmz.product.model.Product;
import com.ugurhmz.product.model.ProductType;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private final static SessionFactory sessionFactory  = buidSessionFactory();



    // buildSessionFactory
    private static SessionFactory buidSessionFactory(){
        try {
            Configuration cfg = new Configuration();

            //cfg.addAnnotatedClass(Person.class);
            //cfg.addAnnotatedClass(FingerPrint.class);
           // cfg.addAnnotatedClass(Author.class);
           // cfg.addAnnotatedClass(Book.class);
            //cfg.addAnnotatedClass(Country.class);
            //cfg.addAnnotatedClass(City.class);
           // cfg.addAnnotatedClass(Country.class);
            //cfg.addAnnotatedClass(City.class);

           // cfg.addAnnotatedClass(City.class);
           // cfg.addAnnotatedClass(Country.class);
              cfg.addAnnotatedClass(Product.class);
              cfg.addAnnotatedClass(ProductType.class);

            //cfg.addAnnotatedClass(FirstEntity.class);


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
