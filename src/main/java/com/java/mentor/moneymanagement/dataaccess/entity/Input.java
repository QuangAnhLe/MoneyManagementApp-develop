package com.java.mentor.moneymanagement.dataaccess.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Input {
/*- inputId: long
- inputDate: String
- inputDescription: String
- inputCategory: String
- inputAmount: String*/
    // Format
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long inputId;
    private Long inputDate;
    private String inputDescription;
    private Category inputCategory;
    private Double inputAmount;

    public Input(Long inputId, Long inputDate, String inputDescription, Category inputCategory, Double inputAmount) {
        this.inputId = inputId;
        this.inputDate = inputDate;
        this.inputDescription = inputDescription;
        this.inputCategory = inputCategory;
        this.inputAmount = inputAmount;
    }

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

    public Double getInputAmount() {
        return inputAmount;
    }

    public void setInputAmount(Double inputAmount) {
        this.inputAmount = inputAmount;
    }
}
