package com.example.ORMx;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random r= new Random();

        Configuration config =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);

        SessionFactory sf=config.buildSessionFactory();
        Session session=sf.openSession();

//        creating the data
//        for (int i = 1; i <= 50; i++) {
//            Student s=new Student();
//            s.setName("Name"+i);
//            s.setRollno(i);
//            s.setMarks(r.nextInt(100));
//            session.save(s);
//        }

//        fetching all the data
//        Query q=session.createQuery("from Student");
//        List<Student> students=q.getResultList();
//        for(Student s:students){
////            System.out.println(s);
//        }

//        students with marks greater than 50
        Query q1=session.createQuery("from Student where marks > 50");
        List<Student> students=q1.getResultList();
        for(Student s:students){
            //System.out.println(s);
        }

//        getting unique values
        Query q2=session.createQuery("from Student where rollno=9");
        Student s9=(Student)q2.getSingleResult();
        System.out.println(s9);

//      getting specific column of unique value
        Query q3=session.createQuery("select rollno,name,marks from Student where rollno=9");
        Object[] s10=(Object[])q3.getSingleResult();
        //System.out.println(s10[0]+" :" +s10[1]+":"+s10[2]);

//        getting specific coloumn of all values
        Query q4=session.createQuery("select rollno,name,marks from Student");
        List<Object[]> sALL=(List<Object[]>)q4.getResultList();
        for(Object[] s: sALL){
//            System.out.println(s[0]+" :" +s[1]+":"+s[2]);
        }

        Query q5=session.createQuery("select rollno,name,marks from Student s where s.marks>50");
        List<Object[]> sFiltered=(List<Object[]>)q5.getResultList();
        for(Object[] s: sFiltered){
            //System.out.println(s[0]+" :" +s[1]+":"+s[2]);
        }

//        Aggregate funtions
        Query q6=session.createQuery("select sum(marks) from Student where marks>60");
        Double sumMarksGT60=(Double)q6.getSingleResult();
        System.out.println(sumMarksGT60);

//        Parameter in query
        int a=50;
        int b=70;
        Query q7=session.createQuery("from Student where marks between :p and :q");
        q7.setParameter("p",a);
        q7.setParameter("q",b);
        List<Student> students7=q7.getResultList();
        for(Student s:students7){
            System.out.println(s);
        }

        Laptop l =new Laptop();
        



        Transaction tx=session.beginTransaction();
        tx.commit();

    }
}
