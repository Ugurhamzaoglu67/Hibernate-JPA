package com.ugurhmz.main;


import com.ugurhmz.model._01OneToOne.FingerPrint;
import com.ugurhmz.model._01OneToOne.Person;
import com.ugurhmz.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainOneToOne {
    public static void main(String[] args) {

        Person person_ugur = new Person();
        person_ugur.setName("Ugur hmz");


        FingerPrint fingerPrint = new FingerPrint();
        fingerPrint.setFileName("C213123B");

        fingerPrint.setPerson(person_ugur);
        person_ugur.setFingerPrint(fingerPrint);


        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        fingerPrint = (FingerPrint) session.merge(fingerPrint);

        transaction.commit();


        FingerPrint fingerP = session.find(FingerPrint.class, fingerPrint.getId());

        Person person1 = null;

        if(fingerP != null){
            person1 =  fingerP.getPerson();
        }

        FingerPrint fingerP2 = null;

        if(person1 != null){
                Person person2 = session.find(Person.class, person1.getId());

                if(person2  != null){
                    fingerP2 = person2.getFingerPrint();
                }
        }


        System.out.println(person1.getName());
        System.out.println(fingerP2.getFileName());

    }
}
