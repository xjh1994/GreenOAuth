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


    public String execute() throws Exception {


        return "success";
    }


}
