package com.niit.daoimpl;

import javax.persistence.AssociationOverride;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.AccountDao;

// Transactional for Hibernate
@Transactional

public class AccountDaoImpl implements AccountDao{
	
	  @Autowired
	    private SessionFactory sessionFactory;

	public boolean findAccount(String userName) {
		Session session = sessionFactory.getCurrentSession();
        Criteria crit = session.createCriteria(AccountDaoImpl.class);
        crit.add(Restrictions.eq("userName", userName));
        return true;
	}

		
		
		   
		   
	}


