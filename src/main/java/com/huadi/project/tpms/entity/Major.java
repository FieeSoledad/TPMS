package com.huadi.project.tpms.entity;

import java.io.Serializable;

/**
 * (Major)实体类
 *
 * @author makejava
 * @since 2023-07-25 10:54:17
 */
public class Major implements Serializable {
    private static final long serialVersionUID = 709044824868970306L;
    
    private String majorId;
    
    private String collegeId;
    
    private String majorName;


    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

}

