package com.java.mentor.moneymanagement.logic.to;

import java.util.Objects;

public class InputTO {

    private Long inputId;
    private String inputDate;
    private String inputDescription;
    private String inputAmount;


    public Long getInputId() {
        return inputId;
    }

    public InputTO setInputId(Long inputId) {
        this.inputId = inputId;
        return this;
    }


    public String getInputDate() {
        return inputDate;
    }

    public InputTO setInputDate(String inputDate) {
        this.inputDate = inputDate;
        return this;
    }

    public String getInputDescription() {
        return inputDescription;
    }

    public InputTO setInputDescription(String inputDescription) {
        this.inputDescription = inputDescription;
        return this;
    }

    public String getInputAmount() {
        return inputAmount;
    }

    public InputTO setInputAmount(String inputAmount) {
        this.inputAmount = inputAmount;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InputTO)) return false;
        InputTO that = (InputTO) o;
        return Objects.equals(inputId, that.inputId)
                && Objects.equals(inputDate, that.inputDate)
                && Objects.equals(inputDescription, that.inputDescription)
                && Objects.equals(inputAmount, that.inputAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputId, inputDate, inputDescription, inputAmount);
    }
}
