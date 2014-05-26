package com.zts1993.action.Login;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zts1993.bean.GreenOptions;
import com.zts1993.bean.GreenUser;
import com.zts1993.bean.UserLogin;
import com.zts1993.dao.GreenOptionsDAO;
import com.zts1993.dao.GreenUserDAO;
import com.zts1993.util.MD5Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Created by TianShuo on 14-5-20.
 */
public class Login extends ActionSupport {


    UserLogin userLogin;

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }


    public String execute() throws Exception {


        ActionContext.getContext().getSession().put("isLogin", "1");

//        Configuration configuration = new Configuration().configure();
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        GreenOptions greenOptions = new GreenOptions();
//        greenOptions.setOptionName("author");
//        greenOptions.setOptionValue("zts1993");
//        greenOptions.setAutoload("true");
//
//        session.save(greenOptions);
//        transaction.commit();
//        session.close();

//        GreenOptionsDAO greenOptionsDAO = new GreenOptionsDAO();
//        greenOptionsDAO.save(greenOptions);


        GreenUserDAO greenUserDAO = new GreenUserDAO();
        GreenUser greenUser=new GreenUser();
        greenUser.setUserLogin(getUserLogin().getUsername());
        greenUser.setUserPass(MD5Util.MD5(getUserLogin().getPassword()));

        if(greenUserDAO.loginCheck(greenUser)){
            System.out.println("Login Success");
            return "success";

        }else{
            System.out.println("Login Failed");
            return "failed";

        }



    }

    public String loginPage() throws Exception {


        return "success";

    }
}
