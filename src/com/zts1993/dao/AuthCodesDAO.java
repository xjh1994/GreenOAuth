package com.zts1993.Dao;

import com.zts1993.Bean.AuthCodes;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for
 * AuthCodes entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 *
 * @author MyEclipse Persistence Tools
 * @see com.zts1993.Bean.AuthCodes
 */
public class AuthCodesDAO extends BaseHibernateDAO {
    private static final Logger log = LoggerFactory
            .getLogger(AuthCodesDAO.class);
    // property constants
    public static final String CODE = "code";
    public static final String REDIRECT_URI = "redirectUri";
    public static final String UUID = "uuid";
    public static final String EXPIRES = "expires";
    public static final String SCOPE = "scope";

    public void save(AuthCodes transientInstance) {
        log.debug("saving AuthCodes instance");
        try {
            Session session = getSession();
            Transaction tx = session.beginTransaction();
            session.save(transientInstance);
            tx.commit();
            session.close();
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }

    public void delete(AuthCodes persistentInstance) {
        log.debug("deleting AuthCodes instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }

    public AuthCodes findById(Long id) {
        log.debug("getting AuthCodes instance with id: " + id);
        try {
            AuthCodes instance = (AuthCodes) getSession().get(
                    "com.zts1993.AuthCodes", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    public List findByExample(AuthCodes instance) {
        log.debug("finding AuthCodes instance by example");
        try {
            List results = getSession().createCriteria("com.zts1993.AuthCodes")
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
        log.debug("finding AuthCodes instance with property: " + propertyName
                + ", value: " + value);
        try {
            String queryString = "from AuthCodes as model where model."
                    + propertyName + "= ?";
            Query queryObject = getSession().createQuery(queryString);
            queryObject.setParameter(0, value);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find by property name failed", re);
            throw re;
        }
    }


    public List findByUuidAndClientId(Object uuid, Object clientId) {
        log.debug("finding AuthCodes ByUuidAndClientId ");
        try {
            String queryString = "from AuthCodes as model where model.uuid= ? and model.clientId= ? ";
            Query queryObject = getSession().createQuery(queryString);
            queryObject.setParameter(0, uuid);
            queryObject.setParameter(1, clientId);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find by ByUuidAndClientId", re);
            throw re;
        }

    }


    public List findByUuid(Object uuid) {
        return findByProperty(UUID, uuid);
    }


    public List findByCode(Object code) {
        return findByProperty(CODE, code);
    }

    public List findByRedirectUri(Object redirectUri) {
        return findByProperty(REDIRECT_URI, redirectUri);
    }

    public List findByExpires(Object expires) {
        return findByProperty(EXPIRES, expires);
    }

    public List findByScope(Object scope) {
        return findByProperty(SCOPE, scope);
    }

    public List findAll() {
        log.debug("finding all AuthCodes instances");
        try {
            String queryString = "from AuthCodes";
            Query queryObject = getSession().createQuery(queryString);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find all failed", re);
            throw re;
        }
    }

    public AuthCodes merge(AuthCodes detachedInstance) {
        log.debug("merging AuthCodes instance");
        try {
            AuthCodes result = (AuthCodes) getSession().merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(AuthCodes instance) {
        log.debug("attaching dirty AuthCodes instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

    public void attachClean(AuthCodes instance) {
        log.debug("attaching clean AuthCodes instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}