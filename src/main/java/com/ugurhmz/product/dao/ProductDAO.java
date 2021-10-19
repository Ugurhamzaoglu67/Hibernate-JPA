package com.ugurhmz.product.dao;


import com.ugurhmz.util.HibernateUtil;
import org.hibernate.SessionFactory;


public class ProductDAO {

    private SessionFactory sessionFactory;


    public ProductDAO(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }

}
