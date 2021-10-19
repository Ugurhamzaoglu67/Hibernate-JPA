package com.ugurhmz.product.dao;


import com.ugurhmz.product.model.ProductType;
import com.ugurhmz.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class ProductTypeDAO {   // DB Erişim demek, Db erişim ise -> session açmak demek.

    private SessionFactory sessionFactory;




    // Aşağıda yazılan tüm sorgular için kullanmak için bu şekilde constructorda yazdık.
    public ProductTypeDAO(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }


    //LIST
    public List<ProductType> findAll(){
        Session session = sessionFactory.openSession();

       Query query = session.createQuery("select productType from ProductType productType");

       return query.list();
    }





}
