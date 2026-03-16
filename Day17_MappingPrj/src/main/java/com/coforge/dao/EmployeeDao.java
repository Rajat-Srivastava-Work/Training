package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.coforge.entities.Employee;
import com.coforge.utils.HibernateUtil;


public class EmployeeDao {
	public List<Employee> getAllEmployee(){
		try(Session session=HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("From Employee",Employee.class).list();
			
		}
	}
	public void insertEmployee(Employee employee) {
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()) {
			tx=session.beginTransaction();
			session.persist(employee);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()) {
			tx=session.beginTransaction();
			session.merge(employee);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}	
	}
	public void deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			tx=session.beginTransaction();
			Employee employee=session.get(Employee.class, eid);
			if(employee!=null) {
				session.remove(employee);
			} 
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public Employee getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			return session.get(Employee.class, eid);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
