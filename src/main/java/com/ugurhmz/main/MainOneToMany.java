package com.ugurhmz.main;



import com.ugurhmz.model._04OneToMany.City;
import com.ugurhmz.model._04OneToMany.Country;
import com.ugurhmz.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainOneToMany {
    public static void main(String[] args) {

        Country mycountry =  new Country();
        mycountry.setName("USA");

        City city0 = new City();
        city0.setName("New York");
        city0.setCountry(mycountry);


        City city1 = new City();
        city1.setName("BOSTON");
        city1.setCountry(mycountry);


        mycountry.getCityList().add(city0);
        mycountry.getCityList().add(city1);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.merge(mycountry);

        transaction.commit();

    }
}
