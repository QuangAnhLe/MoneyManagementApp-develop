package com.java.mentor.moneymanagement.dataaccess.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Input {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long inputId;
    private Long inputDate;
    private String inputDescription;
    private Category inputCategory;
    private BigDecimal inputAmount;

    public Long getInputId() {
        return inputId;
    }

    public void setInputId(Long inputId) {
        this.inputId = inputId;
    }

    public Long getInputDate() {
        return inputDate;
    }

    public void setInputDate(Long inputDate) {
        this.inputDate = inputDate;
    }

    public String getInputDescription() {
        return inputDescription;
    }

    public void setInputDescription(String inputDescription) {
        this.inputDescription = inputDescription;
    }

    public Category getInputCategory() {
        return inputCategory;
    }

    public void setInputCategory(Category inputCategory) {
        this.inputCategory = inputCategory;
    }

    public BigDecimal getInputAmount() {
        return inputAmount;
    }

    public void setInputAmount(BigDecimal inputAmount) {
        this.inputAmount = inputAmount;
    }
}
