package com.coforge.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.coforge.entities.Item;
import com.coforge.entities.Order;
import com.coforge.util.HibernateUtil;

public class OrderDao implements OrderDaoInterface{

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			return session.createQuery("From Order",Order.class).list();
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void insertOrder(Order ord) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()) {
			tx=session.beginTransaction();
			session.persist(ord);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateOrder(Order ord) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()) {
			tx=session.beginTransaction();
			session.merge(ord);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteOrder(long ordId) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			tx=session.beginTransaction();
			Item item=session.get(Item.class, ordId);
			if(item!=null) {
				session.remove(item);
			} 
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Item getById(long ordId) {
		// TODO Auto-generated method stub
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			return session.get(Item.class, ordId);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
