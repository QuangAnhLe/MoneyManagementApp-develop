package com.java.mentor.moneymanagement.logic.mapper;
import com.java.mentor.moneymanagement.dataaccess.entity.Input;
import com.java.mentor.moneymanagement.logic.to.InputTO;

public class InputMapper {

    public static InputTO mapInputEntitytoTO(Input input){
        return new InputTO()
                .setInputId(input.getInputId())
                .setInputDate(input.getInputDate())
                .setInputDescription(input.getInputDescription())
                .setInputAmount(input.getInputAmount())
                .setInputCategory(input.getInputCategory());
    }
    public static Input mapInputTOtoEntity(InputTO inputto){
        Input entity = new Input();
        entity.setInputId(inputto.getInputId());
        entity.setInputDate(inputto.getInputDate());
        entity.setInputDescription(inputto.getInputDescription());
        entity.setInputAmount(inputto.getInputAmount());
        return entity;
    }

}
