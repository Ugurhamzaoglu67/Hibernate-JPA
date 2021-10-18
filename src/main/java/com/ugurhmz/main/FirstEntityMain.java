package com.ugurhmz.main;


import com.ugurhmz.model.FirstEntity;
import com.ugurhmz.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FirstEntityMain {

    public static void main(String[] args) {

        FirstEntity firstEntity = new FirstEntity();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.merge(firstEntity);
        transaction.commit();

    }
}
