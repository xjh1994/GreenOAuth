package com.zts1993.Action.Client;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by TianShuo on 14-6-21.
 */
public class LoginPageAction extends ActionSupport{


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String clientName="GreenCMS";
    private String redirect_uri_login;

    public String getRedirect_uri_login() {
        return redirect_uri_login;
    }

    public void setRedirect_uri_login(String redirect_uri_login) {
        this.redirect_uri_login = redirect_uri_login;
    }

    public String execute() throws Exception {


        return "success";
    }


}
