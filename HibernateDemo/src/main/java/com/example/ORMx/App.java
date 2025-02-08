package com.example.ORMx;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Alien x1=new Alien();
        x1.setAid(101);
        x1.setAcolor("Green");
//        x1.setAname("Xorp");
        AlienName xname=new AlienName();
        xname.firstName="Mahendra";
        xname.middleName="Singh";
        xname.lastName="Dhoni";
        x1.setAname(xname);



        Configuration con =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(x1);
        x1=(Alien)session.get(Alien.class,101);
        System.out.println(x1);
        tx.commit();

    }
}
