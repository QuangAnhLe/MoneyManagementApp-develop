package com.java.mentor.moneymanagement.logic.mapper;
import com.java.mentor.moneymanagement.dataaccess.entity.Input;
import com.java.mentor.moneymanagement.logic.to.InputTO;

public class InputMapper {

    public static InputTO mapInputEntitytoT(Input input){
        return new InputTO()
                .setInputId(input.getInputId())
                .setInputDate(input.getInputDate())
                .setInputDescription(input.getInputDescription())
                .setInputAmount(input.getInputAmount());
    }
}
