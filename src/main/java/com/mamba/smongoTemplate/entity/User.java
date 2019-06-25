package com.mamba.smongoTemplate.entity;

import org.springframework.data.annotation.Id;

/**
 * desc:
 * author:devzhong
 * Date:2019/6/25 15:09
 */
public class User {

    @Id
    private String id;

    private String userName;

    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
