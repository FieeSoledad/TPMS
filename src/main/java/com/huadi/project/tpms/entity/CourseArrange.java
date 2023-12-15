package com.huadi.project.tpms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (CourseArrange)实体类
 *
 * @author makejava
 * @since 2023-07-25 11:40:07
 */
public class CourseArrange implements Serializable {
    private static final long serialVersionUID = -35685812374544067L;
    
    private String courseId;
    
    private String classroomId;
    
    private String courseArrangeTime;
    
    private Integer courseArrangePweek;


    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId;
    }

    public String getCourseArrangeTime() {
        return courseArrangeTime;
    }

    public void setCourseArrangeTime(String courseArrangeTime) {
        this.courseArrangeTime = courseArrangeTime;
    }

    public Integer getCourseArrangePweek() {
        return courseArrangePweek;
    }

    public void setCourseArrangePweek(Integer courseArrangePweek) {
        this.courseArrangePweek = courseArrangePweek;
    }

}

