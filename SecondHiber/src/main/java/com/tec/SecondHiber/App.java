package com.tec.SecondHiber;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Creating question
        Question q1 = new Question();
        q1.setqNo(141);
        q1.setQuestion("What is your name");
        
    	// Creating Answere
        
       Answere ans1 = new Answere();
       ans1.setaId(207);
       ans1.setAns("My name is Prashanth");
       q1.setAns(ans1);
       
       Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
       Transaction tx = session.beginTransaction();
       session.save(q1);
       tx.commit();
       
       
    	
    }
}
