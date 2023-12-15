package com.huadi.project.tpms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Exam)实体类
 *
 * @author makejava
 * @since 2023-07-25 10:59:12
 */
public class Exam implements Serializable {
    private static final long serialVersionUID = 923914452203923663L;
    
    private String examId;
    
    private String courseId;
    
    private String userId;
    
    private String examType;
    
    private String examState;
    
    private String examTime;
    
    private String classroomId;


    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

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

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getExamState() {
        return examState;
    }

    public void setExamState(String examState) {
        this.examState = examState;
    }

    public String getExamTime() {
        return examTime;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }

    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId;
    }
}

