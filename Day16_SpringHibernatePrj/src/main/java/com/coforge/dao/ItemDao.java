package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.coforge.entities.Item;
import com.coforge.util.HibernateUtil;

public class ItemDao implements ItemDaoInterface {

	@Override
	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			return session.createQuery("from Item",Item.class).list();
		}  catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insertItem(Item item) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()) {
			tx=session.beginTransaction();
			session.persist(item);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	
		
	}

	@Override
	public void updateItem(Item item) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()) {
			tx=session.beginTransaction();
			session.merge(item);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteItem(long id) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			tx=session.beginTransaction();
			Item item=session.get(Item.class, id);
			if(item!=null) {
				session.remove(item);
			} 
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Item getById(long id) {
		// TODO Auto-generated method stub
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			return session.get(Item.class, id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
