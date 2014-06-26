package com.zts1993.Action.Api;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by TianShuo on 14-6-26.
 */
public class UsersShowAction extends ActionSupport {


    private String name;
    private String nick;
    private String head;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String execute() throws Exception {

        name="123456";
        nick="my name";
        head="my name";
        return "success";


    }
}
