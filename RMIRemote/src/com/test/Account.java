package com.test;

import java.io.Serializable;

/**
 * Created by liuzhouliang on 2018/7/19.
 */
public class Account implements Serializable,Cloneable {
    private static final long serialVersionUID = -1858518369668584532L;
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
