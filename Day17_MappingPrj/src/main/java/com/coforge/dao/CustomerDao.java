package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.coforge.entities.Customer;

import com.coforge.utils.HibernateUtil;


public class CustomerDao {
	public List<Customer> getAllCustomers(){
		try(Session session=HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("From Customer",Customer.class).list();
			
		}
	}
	public void insertCustomer(Customer customer) {
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()) {
			tx=session.beginTransaction();
			session.persist(customer);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()) {
			tx=session.beginTransaction();
			session.merge(customer);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}	
	}
	public void deleteCustomer(long custid) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			tx=session.beginTransaction();
			Customer employee=session.get(Customer.class, custid);
			if(employee!=null) {
				session.remove(employee);
			} 
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public Customer getCustomerById(long custid) {
		// TODO Auto-generated method stub
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			return session.get(Customer.class, custid);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
