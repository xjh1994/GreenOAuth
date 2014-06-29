package com.zts1993.Dao;

import com.zts1993.Bean.UserTemp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for
 * UserTemp entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 *
 * @author MyEclipse Persistence Tools
 * @see com.zts1993.Bean.UserTemp
 */
public class UserTempDAO extends BaseHibernateDAO {

    private static Logger log = LogManager.getLogger("UserTempDAO");


    // property constants
    public static final String UUID = "uuid";
    public static final String HEAD = "head";
    public static final String NAME = "name";
    public static final String NICK = "nick";
    public static final String HASH = "hash";
    public static final String OTHER = "other";

    public void save(UserTemp transientInstance) {
        log.debug("saving UserTemp instance");
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

    public void delete(UserTemp persistentInstance) {
        log.debug("deleting UserTemp instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }

    public UserTemp findById(Long id) {
        log.debug("getting UserTemp instance with id: " + id);
        try {
            UserTemp instance = (UserTemp) getSession().get(
                    "com.zts1993.UserTemp", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    public List findByExample(UserTemp instance) {
        log.debug("finding UserTemp instance by example");
        try {
            List results = getSession().createCriteria("com.zts1993.UserTemp")
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
        log.debug("finding UserTemp instance with property: " + propertyName
                + ", value: " + value);
        try {
            String queryString = "from UserTemp as model where model."
                    + propertyName + "= ?";
            Query queryObject = getSession().createQuery(queryString);
            queryObject.setParameter(0, value);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find by property name failed", re);
            throw re;
        }
    }

    public List findByUuid(Object uuid) {
        return findByProperty(UUID, uuid);
    }

    public List findByHead(Object head) {
        return findByProperty(HEAD, head);
    }

    public List findByName(Object name) {
        return findByProperty(NAME, name);
    }

    public List findByNick(Object nick) {
        return findByProperty(NICK, nick);
    }

    public List findByHash(Object hash) {
        return findByProperty(HASH, hash);
    }

    public List findByOther(Object other) {
        return findByProperty(OTHER, other);
    }

    public List findAll() {
        log.debug("finding all UserTemp instances");
        try {
            String queryString = "from UserTemp";
            Query queryObject = getSession().createQuery(queryString);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find all failed", re);
            throw re;
        }
    }

    public UserTemp merge(UserTemp detachedInstance) {
        log.debug("merging UserTemp instance");
        try {
            UserTemp result = (UserTemp) getSession().merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(UserTemp instance) {
        log.debug("attaching dirty UserTemp instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

    public void attachClean(UserTemp instance) {
        log.debug("attaching clean UserTemp instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}