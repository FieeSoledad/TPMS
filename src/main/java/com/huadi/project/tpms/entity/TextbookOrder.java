package com.huadi.project.tpms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TextbookOrder)实体类
 *
 * @author makejava
 * @since 2023-07-25 10:44:40
 */
public class TextbookOrder implements Serializable {
    private static final long serialVersionUID = -28485100151354644L;
    
    private String textbookOrderId;
    
    private String isbn;
    
    private Integer textbookOrderNumber;
    
    private String textbookOrderState;
    
    private String textbookOrderTime;
    
    private Integer textbookOrderPrice;


    public String getTextbookOrderId() {
        return textbookOrderId;
    }

    public void setTextbookOrderId(String textbookOrderId) {
        this.textbookOrderId = textbookOrderId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getTextbookOrderNumber() {
        return textbookOrderNumber;
    }

    public void setTextbookOrderNumber(Integer textbookOrderNumber) {
        this.textbookOrderNumber = textbookOrderNumber;
    }

    public String getTextbookOrderState() {
        return textbookOrderState;
    }

    public void setTextbookOrderState(String textbookOrderState) {
        this.textbookOrderState = textbookOrderState;
    }

    public String getTextbookOrderTime() {
        return textbookOrderTime;
    }

    public void setTextbookOrderTime(String textbookOrderTime) {
        this.textbookOrderTime = textbookOrderTime;
    }

    public Integer getTextbookOrderPrice() {
        return textbookOrderPrice;
    }

    public void setTextbookOrderPrice(Integer textbookOrderPrice) {
        this.textbookOrderPrice = textbookOrderPrice;
    }

}

