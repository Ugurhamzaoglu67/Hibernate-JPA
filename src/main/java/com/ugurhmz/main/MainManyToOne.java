package com.ugurhmz.main;


import com.ugurhmz.model._03ManyToOne.City;
import com.ugurhmz.model._03ManyToOne.Country;
import com.ugurhmz.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainManyToOne {
    public static void main(String[] args) {
        Country country = new Country();
        country.setName("IRELAND");


        City city = new City();
        city.setName("Dublin");
        city.setCountry(country);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.merge(country);

        transaction.commit();
    }
}
