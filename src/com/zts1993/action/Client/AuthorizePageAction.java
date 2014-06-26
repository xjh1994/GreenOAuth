package com.zts1993.Action.Client;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;

/**
 * Created by TianShuo on 14-6-21.
 */
public class AuthorizePageAction extends ActionSupport {
    private static Logger log = LogManager.getLogger("AuthorizePageAction");

    private String response_type;
    private String redirect_uri;
    private String client_id;

    private String redirect_uri_login;

    public String getResponse_type() {
        return response_type;
    }

    public void setResponse_type(String response_type) {
        this.response_type = response_type;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    public String getRedirect_uri_login() {
        return redirect_uri_login;
    }

    public void setRedirect_uri_login(String redirect_uri_login) {
        this.redirect_uri_login = redirect_uri_login;
    }

    public String execute() throws Exception {
        redirect_uri_login = ServletActionContext.getRequest().getRequestURL().toString()+"?"+ServletActionContext.getRequest().getQueryString();

        //todo check if it is legal
        String isLogin = "";
        try {
            isLogin = ActionContext.getContext().getSession().get("isLogin").toString();
        } catch (Exception e) {
            isLogin = "no";

        }

        log.debug("isLogin:" + isLogin);
        log.debug("redirect_uri_login:" + redirect_uri_login);







        if (isLogin.equals("yes")) {
            return "success";
        } else {
            return "login";
        }


    }


}
