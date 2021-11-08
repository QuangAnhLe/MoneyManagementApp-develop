package com.java.mentor.moneymanagement.logic.to;

import com.java.mentor.moneymanagement.dataaccess.entity.Category;

import java.math.BigDecimal;
import java.util.Objects;

public class InputTO {

    private Long inputId;
    private Long inputDate;
    private String inputDescription;
    private BigDecimal inputAmount;
    private Category inputCategory;

    public Long getInputId() {
        return inputId;
    }

    public InputTO setInputId(Long inputId) {
        this.inputId = inputId;
        return this;
    }


    public Long getInputDate() {
        return inputDate;
    }

    public InputTO setInputDate(Long inputDate) {
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

    public BigDecimal getInputAmount() {
        return inputAmount;
    }

    public InputTO setInputAmount(BigDecimal inputAmount) {
        this.inputAmount = inputAmount;
        return this;
    }

    public Category getInputCategory() {
        return inputCategory;
    }

    public InputTO setInputCategory(Category inputCategory) {
        this.inputCategory = inputCategory;
        return this;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof InputTO))
            return false;
        InputTO that = (InputTO) o;
        return Objects.equals(inputId, that.inputId) && Objects.equals(inputDate, that.inputDate)
                && Objects.equals(inputDescription, that.inputDescription)
                && Objects.equals(inputAmount, that.inputAmount)
                && Objects.equals(inputDescription, that.inputDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputId,
                inputDate,
                inputDescription,
                inputAmount,
                inputDescription);
    }

}
