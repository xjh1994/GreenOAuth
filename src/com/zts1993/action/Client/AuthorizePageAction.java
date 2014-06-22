package com.zts1993.Action.Client;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by TianShuo on 14-6-21.
 */
public class AuthorizePageAction extends ActionSupport {

    private String client_id;
    private String response_type;
    private String redirect_uri;


    public String execute() throws Exception {


        return "success";

    }
}
