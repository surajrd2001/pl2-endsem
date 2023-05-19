package com.javawebtutor.hibernate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
 
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Test {
	  public static void main(String[] args) {
	        Session session = new Configuration().configure("hibernate.cfg.xml")
	                .buildSessionFactory().openSession();
	        Transaction t = session.beginTransaction();
	 
	        Employee employee = new Employee();
	        employee.setEmployeeName("Abhishek Bhosale");
	        Set<String> phoneNumbers = new HashSet<String>();
	        phoneNumbers.add("9356221036");
	        phoneNumbers.add("9112967122");
	        phoneNumbers.add("9850516837");
	        employee.setPhoneNumbers(phoneNumbers);
	        session.save(employee);
	        t.commit();
	 
	        Query query = session.createQuery("from Employee");
	        List<Employee> list = query.list();
	 
	        Iterator<Employee> itr = list.iterator();
	        while (itr.hasNext()) {
	            Employee emp = itr.next();
	            System.out.println("Employee Name: " + emp.getEmployeeName());
	 
	            // printing answers
	            Set<String> set = emp.getPhoneNumbers();
	            Iterator<String> itr2 = set.iterator();
	            while (itr2.hasNext()) {
	                System.out.println(itr2.next());
	            }
	        }
	 
	        session.close();
	        System.out.println("success");
	 
	    }
	}

