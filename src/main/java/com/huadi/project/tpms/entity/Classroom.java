package com.huadi.project.tpms.entity;

import java.io.Serializable;

/**
 * (Classroom)实体类
 *
 * @author makejava
 * @since 2023-07-25 11:04:58
 */
public class Classroom implements Serializable {
    private static final long serialVersionUID = 979819390208708673L;
    
    private String classroomId;
    
    private Integer classroomSize;
    
    private String classroomPlace;
    
    private String classroomType;


    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId;
    }

    public Integer getClassroomSize() {
        return classroomSize;
    }

    public void setClassroomSize(Integer classroomSize) {
        this.classroomSize = classroomSize;
    }

    public String getClassroomPlace() {
        return classroomPlace;
    }

    public void setClassroomPlace(String classroomPlace) {
        this.classroomPlace = classroomPlace;
    }

    public String getClassroomType() {
        return classroomType;
    }

    public void setClassroomType(String classroomType) {
        this.classroomType = classroomType;
    }

}

