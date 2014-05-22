package com.zts1993.action.Login;

import com.opensymphony.xwork2.ActionSupport;
import com.zts1993.bean.UserLogin;

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


        return "success";


    }

    public String loginPage() throws Exception {

        return "success";

    }
}
