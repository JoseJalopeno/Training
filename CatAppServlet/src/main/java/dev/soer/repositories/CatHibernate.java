package dev.soer.repositories;

import java.util.List;

import javax.persistence.criteria.*;


import org.hibernate.*;

import dev.soer.models.Cat;
import dev.soer.utils.HibernateUtil;

public class CatHibernate implements GenericRepository<Cat>{

	
	@Override
	public Cat add(Cat t) {
		Session s = HibernateUtil.getSession();
		Transaction tx = null;
		try {
			s.beginTransaction();
			s.save(t);
			s.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			s.getTransaction().rollback();
		} finally {
			s.close();
		}
		return t;
	}

	@Override
	public Cat getById(Integer id) {
		//get a session from the session factory
		Session s = HibernateUtil.getSession();
		Cat c = s.get(Cat.class, id);
		//always close sessions
		s.close();
		return c;
	}
	
	@Override
	public Cat getByName(String name) {
		Session s = HibernateUtil.getSession();
		Cat c = null;
		try {
			CriteriaBuilder cb = s.getCriteriaBuilder();
			CriteriaQuery<Cat> cr = cb.createQuery(Cat.class);
			Root<Cat> root = cr.from(Cat.class);
			
			cr.select(root).where(cb.equal(root.get("name"), name));
			
			c = s.createQuery(cr).getSingleResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return c;
		
	}

	@Override
	public List<Cat> getAll() {
		Session s = HibernateUtil.getSession();
		List<Cat> cats = null;
		try {
			cats = s.createQuery("FROM cats").list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
		return cats;
	}

	@Override
	public void update(Cat c) {
		Session s = HibernateUtil.getSession();
		Transaction tx = null;
		try {
			tx = s.beginTransaction();
			s.update(c);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			s.close();
		}
	}

	@Override
	public void delete(Cat c) {
		Session s = HibernateUtil.getSession();
		Transaction tx = null;
		try {
			tx = s.beginTransaction();
			s.delete(c);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			s.close();
		}
	}
	
	public static void main(String[] args) {
		CatHibernate ch = new CatHibernate();
		Cat c = ch.getById(1);
		System.out.println(c);
	}

}
