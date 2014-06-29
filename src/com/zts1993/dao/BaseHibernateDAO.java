package com.zts1993.Dao;

import com.zts1993.Bean.AuthCodes;
import com.zts1993.Db.HibernateSessionFactory;
import com.zts1993.Db.IBaseHibernateDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
    private static Logger log = LogManager.getLogger("BaseHibernateDAO");


	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
}