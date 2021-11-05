package com.java.mentor.moneymanagement.dataaccess.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long outputId;
    private Long outputDate;
    private String outputDescription;
    private Category outputCategory;
    private BigDecimal outputAmount;

    public Long getOutputId() {
        return outputId;
    }

    public void setOutputId(Long outputId) {
        this.outputId = outputId;
    }

    public Long getOutputDate() {
        return outputDate;
    }

    public void setOutputDate(Long outputDate) {
        this.outputDate = outputDate;
    }

    public String getOutputDescription() {
        return outputDescription;
    }

    public void setOutputDescription(String outputDescription) {
        this.outputDescription = outputDescription;
    }

    public Category getOutputCategory() {
        return outputCategory;
    }

    public void setOutputCategory(Category outputCategory) {
        this.outputCategory = outputCategory;
    }

    public BigDecimal getOutputAmount() {
        return outputAmount;
    }

    public void setOutputAmount(BigDecimal outputAmount) {
        this.outputAmount = outputAmount;
    }
}
