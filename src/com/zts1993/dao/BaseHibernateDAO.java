package com.zts1993.dao;

import com.zts1993.db.HibernateSessionFactory;
import com.zts1993.db.IBaseHibernateDAO;
import org.hibernate.Session;


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
}