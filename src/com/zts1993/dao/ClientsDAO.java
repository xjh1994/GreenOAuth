package com.zts1993.Dao;

import java.util.List;
import java.util.Set;

import com.zts1993.Bean.Clients;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Clients entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zts1993.Bean.Clients
 * @author MyEclipse Persistence Tools
 */
public class ClientsDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(ClientsDAO.class);
	// property constants
	public static final String CLIENT_ID = "clientId";
	public static final String CLIENT_SECRET = "clientSecret";
	public static final String REDIRECT_URI = "redirectUri";
	public static final String USER_ID = "userId";
	public static final String CLIENT_NAME = "clientName";

	public void save(Clients transientInstance) {
		log.debug("saving Clients instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Clients persistentInstance) {
		log.debug("deleting Clients instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Clients findById(Long id) {
		log.debug("getting Clients instance with id: " + id);
		try {
			Clients instance = (Clients) getSession().get(
					"com.zts1993.Clients", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Clients instance) {
		log.debug("finding Clients instance by example");
		try {
			List results = getSession().createCriteria("com.zts1993.Clients")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Clients instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Clients as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByClientId(Object clientId) {
		return findByProperty(CLIENT_ID, clientId);
	}

	public List findByClientSecret(Object clientSecret) {
		return findByProperty(CLIENT_SECRET, clientSecret);
	}

	public List findByRedirectUri(Object redirectUri) {
		return findByProperty(REDIRECT_URI, redirectUri);
	}

	public List findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List findByClientName(Object clientName) {
		return findByProperty(CLIENT_NAME, clientName);
	}

	public List findAll() {
		log.debug("finding all Clients instances");
		try {
			String queryString = "from Clients";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Clients merge(Clients detachedInstance) {
		log.debug("merging Clients instance");
		try {
			Clients result = (Clients) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Clients instance) {
		log.debug("attaching dirty Clients instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Clients instance) {
		log.debug("attaching clean Clients instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}