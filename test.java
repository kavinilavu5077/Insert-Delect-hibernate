package com.model;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student e1=new Student("Kavi Nilavu","Information Technology");
		Student e2=new Student("Krishna","Bio Tech");
		
		Transaction tr=null;
     try(Session session= HbUtil.getSesFactory().openSession())
     {
    	 tr=(Transaction) session.beginTransaction();
    	 session.persist(e1);
    	 session.persist(e2);
    	   tr.commit();
     }
     catch(Exception x)
     {
    	 if(tr!=null)
    	 {  
    		 tr.rollback();
    	     x.printStackTrace(); 
           
    	 }
     }
       
	}

}