package com.huadi.project.tpms.entity;

import java.io.Serializable;

/**
 * (Classes)实体类
 *
 * @author makejava
 * @since 2023-07-25 11:03:28
 */
public class Classes implements Serializable {
    private static final long serialVersionUID = -43199159869537622L;
    
    private String classId;
    
    private String majorId;


    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

}

