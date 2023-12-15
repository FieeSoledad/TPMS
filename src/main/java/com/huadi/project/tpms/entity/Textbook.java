package com.huadi.project.tpms.entity;

import java.io.Serializable;

/**
 * (Textbook)实体类
 *
 * @author makejava
 * @since 2023-07-25 10:48:09
 */
public class Textbook implements Serializable {
    private static final long serialVersionUID = -81560419892557799L;
    
    private String isbn;
    
    private String courseId;
    
    private String textbookName;
    
    private Integer textbookQuantity;
    
    private String textbookPublisher;
    
    private String textbookLocation;


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTextbookName() {
        return textbookName;
    }

    public void setTextbookName(String textbookName) {
        this.textbookName = textbookName;
    }

    public Integer getTextbookQuantity() {
        return textbookQuantity;
    }

    public void setTextbookQuantity(Integer textbookQuantity) {
        this.textbookQuantity = textbookQuantity;
    }

    public String getTextbookPublisher() {
        return textbookPublisher;
    }

    public void setTextbookPublisher(String textbookPublisher) {
        this.textbookPublisher = textbookPublisher;
    }

    public String getTextbookLocation() {
        return textbookLocation;
    }

    public void setTextbookLocation(String textbookLocation) {
        this.textbookLocation = textbookLocation;
    }

}

