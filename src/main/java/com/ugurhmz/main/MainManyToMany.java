package com.ugurhmz.main;


import com.ugurhmz.model._02ManyToMany.Author;
import com.ugurhmz.model._02ManyToMany.Book;
import com.ugurhmz.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainManyToMany {
    public static void main(String[] args) {


        Book book = new Book();
        book.setName("THE SECRET");

        Author author = new Author();
        author.setName("Rhonda Byrne");

        book.getAuthorSet().add(author);
        author.getBookSet().add(book);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        book = (Book) session.merge(book);

        transaction.commit();


    }
}
