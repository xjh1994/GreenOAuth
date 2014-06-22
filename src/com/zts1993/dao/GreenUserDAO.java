package com.zts1993.Dao;

import java.util.List;

import com.zts1993.Bean.GreenUser;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for GreenUser entities.
 * Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions.
 * Each of these methods provides additional information for how to configure it for the desired type of transaction control.
 *
 * @author MyEclipse Persistence Tools
 * @see com.zts1993.Bean.GreenUser
 */
public class GreenUserDAO extends BaseHibernateDAO {
    private static Logger log = LogManager.getLogger("GreenUserDAO");
//    private static final Logger log = LoggerFactory
//            .getLogger(GreenOptionsDAO.class);
    public static final String USER_LOGIN = "userLogin";
    public static final String USER_PASS = "userPass";
    public static final String USER_NICENAME = "userNicename";
    public static final String USER_EMAIL = "userEmail";
    public static final String USER_URL = "userUrl";
    public static final String USER_ACTIVATION_KEY = "userActivationKey";
    public static final String USER_STATUS = "userStatus";
    public static final String USER_INTRO = "userIntro";
    public static final String USER_LEVEL = "userLevel";
    public static final String USER_SESSION = "userSession";


    public boolean loginCheck(GreenUser transientInstance) {
        log.debug("loginCheck");
        try {
            String queryString = "from GreenUser where userLogin =? and userPass=?";
            Query queryObject = getSession().createQuery(queryString);
            queryObject.setParameter(0, transientInstance.getUserLogin());
            queryObject.setParameter(1, transientInstance.getUserPass());
            List res_list = queryObject.list();
            if (res_list.size() == 0) return false;
            else return true;
        } catch (RuntimeException re) {
            log.error("loginCheck failed", re);
            throw re;
        }

    }


    public void save(GreenUser transientInstance) {
        log.debug("saving GreenUser instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }

    public void delete(GreenUser persistentInstance) {
        log.debug("deleting GreenUser instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }

    public GreenUser findById(Long id) {
        log.debug("getting GreenUser instance with id: " + id);
        try {
            GreenUser instance = (GreenUser) getSession()
                    .get("com.zts1993.GreenUser", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }


    public List findByExample(GreenUser instance) {
        log.debug("finding GreenUser instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.zts1993.GreenUser")
                    .add(Example.create(instance))
                    .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }

    public List findByProperty(String propertyName, Object value) {
        log.debug("finding GreenUser instance with property: " + propertyName
                + ", value: " + value);
        try {
            String queryString = "from GreenUser as model where model."
                    + propertyName + "= ?";
            Query queryObject = getSession().createQuery(queryString);
            queryObject.setParameter(0, value);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find by property name failed", re);
            throw re;
        }
    }

    public List findByUserLogin(Object userLogin
    ) {
        return findByProperty(USER_LOGIN, userLogin
        );
    }

    public List findByUserPass(Object userPass
    ) {
        return findByProperty(USER_PASS, userPass);
    }

    public List findByUserNicename(Object userNicename
    ) {
        return findByProperty(USER_NICENAME, userNicename
        );
    }

    public List findByUserEmail(Object userEmail
    ) {
        return findByProperty(USER_EMAIL, userEmail
        );
    }

    public List findByUserUrl(Object userUrl
    ) {
        return findByProperty(USER_URL, userUrl
        );
    }

    public List findByUserActivationKey(Object userActivationKey
    ) {
        return findByProperty(USER_ACTIVATION_KEY, userActivationKey
        );
    }

    public List findByUserStatus(Object userStatus
    ) {
        return findByProperty(USER_STATUS, userStatus
        );
    }

    public List findByUserIntro(Object userIntro
    ) {
        return findByProperty(USER_INTRO, userIntro
        );
    }

    public List findByUserLevel(Object userLevel
    ) {
        return findByProperty(USER_LEVEL, userLevel
        );
    }

    public List findByUserSession(Object userSession
    ) {
        return findByProperty(USER_SESSION, userSession
        );
    }


    public List findAll() {
        log.debug("finding all GreenUser instances");
        try {
            String queryString = "from GreenUser";
            Query queryObject = getSession().createQuery(queryString);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find all failed", re);
            throw re;
        }
    }

    public GreenUser merge(GreenUser detachedInstance) {
        log.debug("merging GreenUser instance");
        try {
            GreenUser result = (GreenUser) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(GreenUser instance) {
        log.debug("attaching dirty GreenUser instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

    public void attachClean(GreenUser instance) {
        log.debug("attaching clean GreenUser instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}