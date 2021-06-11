package org.jsp.hibernate;

import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class App 
{
    public static void main( String[] args )
    {
    	Student s = new Student();
    	s.setId(101);
    	s.setName("sidhu");
    	s.setMobileno(123567891);
    	s.setBranch("cse");
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    	
    	SessionFactory sf  =con.buildSessionFactory();
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	session.save(s);
    	tx.commit();
}
}
