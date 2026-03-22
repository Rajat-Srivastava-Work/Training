package com.coforge.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.coforge.entities.Author;
import com.coforge.entities.Book;
import com.coforge.utils.HibernateUtil;

public class AuthorDao {
	public void getAll() {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			session.createQuery("From Author",Author.class).list().forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void saveAuthor(Author author) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			Transaction tx=session.beginTransaction();
			session.persist(author);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public Author getAuthorById(long aid) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			return session.get(Author.class, aid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	public void removeBookFromAuthor(long aid,long bid) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			Transaction tx=session.beginTransaction();
			Book delBook=null;
			Author author=session.get(Author.class, aid);
			if(author!=null) {
				for(Book book:author.getBookList()) {
					if(book.getBookId()==bid) {
						delBook=book;
					}
					
				}
			} else {
				System.out.println("No deletion");
			}
			if(delBook!=null)
				author.removeBook(delBook);
			tx.commit();
		}
	}

}
