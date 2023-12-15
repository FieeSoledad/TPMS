package com.huadi.project.tpms.entity;

import java.io.Serializable;

/**
 * (Userin)实体类
 *
 * @author makejava
 * @since 2023-07-25 10:40:43
 */
public class Userin implements Serializable {
    private static final long serialVersionUID = 397340535151939833L;

    @Override
    public String toString() {
        return "Userin{" +
                "userId='" + userId + '\'' +
                ", majorId='" + majorId + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    private String userId;
    
    private String majorId;
    
    private String password;
    
    private String role;
    
    private String userName;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}

