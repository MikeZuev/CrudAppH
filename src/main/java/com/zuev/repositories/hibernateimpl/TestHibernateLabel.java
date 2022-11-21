package com.zuev.repositories.hibernateimpl;

import com.zuev.entities.Label;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TestHibernateLabel {
    @Test
    public void TestGetById(){
        HibernateLabelRepository hibernateLabelRepository = null;

        Label newLabel = hibernateLabelRepository.getByld(1L);
        System.out.println(newLabel.toString());
    }

    @Test
    public void TestHibernateConnecton(){

        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.println(session.isConnected());

    }

    @Test
    public void TestHiberCon(){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        System.out.println(sessionFactory);
    }


}
