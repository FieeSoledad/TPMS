package com.huadi.project.tpms.entity;

import java.io.Serializable;

/**
 * (Score)实体类
 *
 * @author makejava
 * @since 2023-07-25 10:51:58
 */
public class Score implements Serializable {
    private static final long serialVersionUID = 271002417445669118L;
    
    private String studentId;
    
    private String courseId;
    
    private Integer score;


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}

