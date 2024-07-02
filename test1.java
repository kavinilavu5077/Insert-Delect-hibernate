package com.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Transaction tr=null;
	     try(Session session=HbUtil.getSesFactory().openSession())
	     {
	          tr= session.beginTransaction();
	          List<Employee> li=session.createQuery("from Employee",Employee.class).list();
	          System.out.println("NAME \t DESIGNATION \t SALARY");
	          li.forEach(e->{
	          
	        	  System.out.println(e.getName()+"\t"+e.getDesignation()+"\t"+e.getSalary());
	          });
	          tr.commit();
	     }
	          catch(Exception x)
	          {
	         	 if(tr!=null)
	         	 {   tr.rollback();
	         	     x.printStackTrace(); 
	                
	         	 }
	          }
	     }
	}
	   