package com.huadi.project.tpms.entity;

import java.io.Serializable;

/**
 * (College)实体类
 *
 * @author makejava
 * @since 2023-07-25 11:06:19
 */
public class College implements Serializable {
    private static final long serialVersionUID = 423210667842054033L;
    
    private String collegeId;
    
    private String collegePlace;
    
    private String collegeName;


    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegePlace() {
        return collegePlace;
    }

    public void setCollegePlace(String collegePlace) {
        this.collegePlace = collegePlace;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

}

