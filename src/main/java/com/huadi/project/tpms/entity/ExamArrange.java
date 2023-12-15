package com.huadi.project.tpms.entity;

import java.io.Serializable;

/**
 * (ExamArrange)实体类
 *
 * @author makejava
 * @since 2023-07-25 10:55:51
 */
public class ExamArrange implements Serializable {
    private static final long serialVersionUID = 301445935908296479L;
    
    private String examId;
    
    private String studentId;


    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}

