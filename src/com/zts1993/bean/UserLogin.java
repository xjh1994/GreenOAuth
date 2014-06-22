package com.zts1993.Bean;

import java.io.Serializable;

/**
 * Created by TianShuo on 14-5-22.
 */
public class UserLogin implements Serializable {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
