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
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long inputId;
    private String inputDate;
    private String inputDescription;
    private String inputCategory;
    private String inputAmount;

    public Input(Long inputId, String inputDate, String inputDescription, String inputCategory, String inputAmount) {
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

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
    }

    public String getInputDescription() {
        return inputDescription;
    }

    public void setInputDescription(String inputDescription) {
        this.inputDescription = inputDescription;
    }

    public String getInputCategory() {
        return inputCategory;
    }

    public void setInputCategory(String inputCategory) {
        this.inputCategory = inputCategory;
    }

    public String getInputAmount() {
        return inputAmount;
    }

    public void setInputAmount(String inputAmount) {
        this.inputAmount = inputAmount;
    }
}
