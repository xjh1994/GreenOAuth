package com.zts1993.Action.Client;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zts1993.Service.KczlLoginService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by TianShuo on 14-6-22.
 */
public class LoginAction extends ActionSupport {
    public String getRedirect_uri_login() {
        return redirect_uri_login;
    }

    public void setRedirect_uri_login(String redirect_uri_login) {
        this.redirect_uri_login = redirect_uri_login;
    }

    private static Logger log = LogManager.getLogger("LoginAction");

    private String userId;
    private String passwd;
    private String redirect_uri_login;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }


    public String execute() throws Exception {

        KczlLoginService kczlLoginService = new KczlLoginService(userId, passwd);
        String result = kczlLoginService.login();
        String jsonString = kczlLoginService.getStrResult();

        log.debug(result);
        log.debug(jsonString);

        if (result.equals("exception")) {
            return "exception";
        }

        ActionContext.getContext().getSession().put("isLogin", "yes");


        if(!redirect_uri_login.equals("")){
            return "authorize";
        }

        return "success";
    }


}
