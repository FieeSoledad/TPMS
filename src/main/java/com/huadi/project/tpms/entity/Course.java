package com.huadi.project.tpms.entity;

import java.io.Serializable;

/**
 * (Course)实体类
 *
 * @author makejava
 * @since 2023-07-25 11:07:53
 */
public class Course implements Serializable {
    private static final long serialVersionUID = 668348161576987926L;
    
    private String courseId;
    
    private String userId;
    
    private String courseName;
    
    private Integer courseNumweek;
    
    private Integer credit;
    
    private String term;
    
    private String courseType;


    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseNumweek() {
        return courseNumweek;
    }

    public void setCourseNumweek(Integer courseNumweek) {
        this.courseNumweek = courseNumweek;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

}

