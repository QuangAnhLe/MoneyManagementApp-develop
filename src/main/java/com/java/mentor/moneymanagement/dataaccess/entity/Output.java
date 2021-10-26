package com.java.mentor.moneymanagement.dataaccess.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long outputId;
    private String outputDate;
    private String outputDescription;
    private String outputCategory;
    private String outputAmount;

    public Long getOutputId() {
        return outputId;
    }

    public void setOutputId(Long outputId) {
        this.outputId = outputId;
    }

    public String getOutputDate() {
        return outputDate;
    }

    public void setOutputDate(String outputDate) {
        this.outputDate = outputDate;
    }

    public String getOutputDescription() {
        return outputDescription;
    }

    public void setOutputDescription(String outputDescription) {
        this.outputDescription = outputDescription;
    }

    public String getOutputCategory() {
        return outputCategory;
    }

    public void setOutputCategory(String outputCategory) {
        this.outputCategory = outputCategory;
    }

    public String getOutputAmount() {
        return outputAmount;
    }

    public void setOutputAmount(String outputAmount) {
        this.outputAmount = outputAmount;
    }
}
