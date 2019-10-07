package com.niit.daoimpl;

import javax.persistence.OrderBy;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

//Transactional for Hibernate
@Transactional

public class OrderDaoImpl {
	 
	  @Autowired
	    private SessionFactory sessionFactory;
	  
	  public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		
	        String sql = "Select max(o.orderNum) from " + OrderBy.class.getName() + " o ";
	        Session session = sessionFactory.getCurrentSession();
	        Query query = session.createQuery(sql);
	        Integer value = (Integer) query.uniqueResult();
	        if (value == null) {
	            return;
	        }
	        return;
	    }
	 
	 
	    }
	
	   

