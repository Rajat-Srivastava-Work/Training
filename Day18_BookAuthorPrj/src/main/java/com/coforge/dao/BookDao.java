package com.coforge.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.coforge.entities.Book;
import com.coforge.utils.HibernateUtil;

public class BookDao {
	public void getAll() {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			session.createQuery("From Book",Book.class).list().forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void saveBook(Book book) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			Transaction tx=session.beginTransaction();
			session.persist(book);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public Book getBookById(long bid) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			return session.get(Book.class, bid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
}
