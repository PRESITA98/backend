package com.niit.daoimpl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

//Transactional for Hibernate
@Transactional

public class ProductDaoImpl {
	@Autowired
    private SessionFactory sessionFactory;
	public void findProduct(String code) {
        Session session = sessionFactory.getCurrentSession();
        Criteria crit = session.createCriteria(ProductDaoImpl.class);
        crit.add(Restrictions.eq("code", code));
        return;
    }

}
