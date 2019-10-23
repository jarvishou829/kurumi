package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author phubing
 * @Description:
 * @time 2019/4/18 11:55
 */
public class UserInfo {

    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 用户名
     */
    @Column(name = "userName")
    private String userName;


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

}
