package com.example.common;

/**
 * @Title: UserContext.java
 * @Author: HSL
 * @Date: 2023/12/14 21:51
 * @Description:
 */
public class UserContext {
    private static final ThreadLocal<Long> tl = new ThreadLocal<>();

    public static void setUser(Long userId){
        tl.set(userId);
    }

    public static Long getUser(){return tl.get();}

    public static void removeUser(){tl.remove();}
}
