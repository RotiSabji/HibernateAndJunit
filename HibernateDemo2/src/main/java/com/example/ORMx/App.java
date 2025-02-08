package com.example.ORMx;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collection;

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

        Alien x2=new Alien();
        x2.setAid(102);
        x2.setAcolor("blue");
        AlienName xname2=new AlienName();
        xname2.firstName="himashu";
        xname2.middleName="Singh";
        xname2.lastName="kholi";
        x2.setAname(xname2);

//        Laptop objects
        Laptop l1=new Laptop();
        l1.setLid(1);
        l1.setBrand("Dell");
        l1.setPrice(1000);
        l1.setAlien(x1);

        Laptop l2=new Laptop();
        l2.setLid(2);
        l2.setBrand("Apple");
        l2.setPrice(2000);
        l2.setAlien(x1);
        ArrayList<Laptop> listOfLaptop=new ArrayList<>();
        listOfLaptop.add(l1);
        listOfLaptop.add(l2);
        x1.setLaps(listOfLaptop);



        Configuration con =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
//        session.save(x1);
//        session.save(x2);
//        session.save(l1);
//        session.save(l2);

        //level 1 cache
        x1=(Alien)session.get(Alien.class,102);
        System.out.println(x1);
        x1=(Alien)session.get(Alien.class,102);
        System.out.println(x1);

        //second level cache
        Session session2=sf.openSession();
        x1=(Alien)session2.get(Alien.class,102);
        System.out.println(x1);

        tx.commit();

    }
}
