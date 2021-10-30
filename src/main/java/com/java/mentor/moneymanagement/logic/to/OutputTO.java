package com.java.mentor.moneymanagement.logic.to;

import java.util.Objects;

public class OutputTO {

    private Long outputId;
    private String outputDate;
    private String outputDescription;
    private String outputAmount;


    public Long getOutputId() {
        return outputId;
    }

    public OutputTO setOutputId(Long outputId) {
        this.outputId = outputId;
        return this;
    }

    public String getOutputDate() {
        return outputDate;
    }

    public OutputTO setOutputDate(String outputDate) {
        this.outputDate = outputDate;
        return this;
    }

    public String getOutputDescription() {
        return outputDescription;
    }

    public OutputTO setOutputDescription(String outputDescription) {
        this.outputDescription = outputDescription;
        return this;
    }

    public String getOutputAmount() {
        return outputAmount;
    }

    public OutputTO setOutputAmount(String outputAmount) {
        this.outputAmount = outputAmount;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OutputTO)) return false;
        OutputTO that = (OutputTO) o;
        return Objects.equals(outputId, that.outputId)
                && Objects.equals(outputDate, that.outputDate)
                && Objects.equals(outputDescription, that.outputDescription)
                && Objects.equals(outputAmount, that.outputAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outputId, outputDate, outputDescription, outputAmount);
    }
}
