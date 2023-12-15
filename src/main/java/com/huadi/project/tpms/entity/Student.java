package com.huadi.project.tpms.entity;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2023-07-25 10:50:17
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 156222784377667138L;
    
    private String studentId;
    
    private String classId;
    
    private String studentName;
    
    private String studentPhone;
    
    private String studentGender;


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

}

