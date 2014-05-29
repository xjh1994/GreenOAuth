package com.zts1993.test;

import com.zts1993.bean.GreenOptions;
import com.zts1993.dao.GreenOptionsDAO;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 * Created by TianShuo on 14-5-26.
 */
public class HibernateTest {

    public static void main(String[] args) {


        Configuration configuration = new Configuration().configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        GreenOptions greenOptions = new GreenOptions();
        greenOptions.setOptionName("author");
        greenOptions.setOptionValue("zts1993");
        greenOptions.setAutoload("true");

        session.save(greenOptions);
        transaction.commit();
        session.close();

        GreenOptionsDAO greenOptionsDAO = new GreenOptionsDAO();
        greenOptionsDAO.save(greenOptions);

    }
}
