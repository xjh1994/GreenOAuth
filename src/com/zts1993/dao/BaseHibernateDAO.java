package com.zts1993.Dao;

import com.zts1993.Db.HibernateSessionFactory;
import com.zts1993.Db.IBaseHibernateDAO;
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