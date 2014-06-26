package com.zts1993.Action.Client;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by TianShuo on 14-6-23.
 */
public class AccessTokenAction extends ActionSupport {

    /**
     * input param
     */
    private String client_id;
    private String client_secret;
    private String grant_type;
    private String redirect_uri;
    private String code;

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * output param
     */
    private String access_token;
    private String expires_in;
    private String remind_in;
    private String uid;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getRemind_in() {
        return remind_in;
    }

    public void setRemind_in(String remind_in) {
        this.remind_in = remind_in;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }



    public String execute() throws Exception {

        access_token="ACCESS_TOKEN";
        expires_in="1234";
        remind_in="798114";
        uid="12341234";

        return "success";

    }


}
