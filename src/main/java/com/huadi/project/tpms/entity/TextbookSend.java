package com.huadi.project.tpms.entity;

import java.io.Serializable;

/**
 * (TextbookSend)实体类
 *
 * @author makejava
 * @since 2023-07-25 10:42:49
 */
public class TextbookSend implements Serializable {
    private static final long serialVersionUID = -91553809902410375L;
    
    private String classId;
    
    private String isbn;
    
    private Integer textbookSendNumber;


    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getTextbookSendNumber() {
        return textbookSendNumber;
    }

    public void setTextbookSendNumber(Integer textbookSendNumber) {
        this.textbookSendNumber = textbookSendNumber;
    }

}

