package com.zts1993.action.Login;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zts1993.bean.GreenUser;
import com.zts1993.bean.UserLogin;
import com.zts1993.dao.GreenUserDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Created by TianShuo on 14-5-20.
 */
public class LoginAction extends ActionSupport {
    private static Logger log = LogManager.getLogger("LoginAction");


    UserLogin userLogin;

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }


    public String execute() throws Exception {


        ActionContext.getContext().getSession().put("isLogin", "1");


        GreenUserDAO greenUserDAO = new GreenUserDAO();
        GreenUser greenUser = new GreenUser(getUserLogin().getUsername(), getUserLogin().getPassword());


        if (greenUserDAO.loginCheck(greenUser)) {
            log.debug("LoginAction Success");
            greenUser = (GreenUser) greenUserDAO.findByUserLogin(getUserLogin().getUsername()).get(0);
            log.debug("greenUser:" + greenUser.toString());

            return "success";
        } else {
            this.addFieldError("userLogin.username","用户名或者密码错误");
            log.debug("LoginAction Failed");
            return "input";
        }
    }
}
