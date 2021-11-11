package com.java.mentor.moneymanagement.logic.mapper;

import com.java.mentor.moneymanagement.dataaccess.entity.Input;
import com.java.mentor.moneymanagement.dataaccess.entity.Output;
import com.java.mentor.moneymanagement.logic.to.InputTO;
import com.java.mentor.moneymanagement.logic.to.OutputTO;

public class OutputMapper {

    public static OutputTO mapOutputEntitytoTO(Output output){
        return new OutputTO()
                .setOutputId(output.getOutputId())
                .setOutputDate(output.getOutputDate())
                .setOutputDescription(output.getOutputDescription())
                .setOutputAmount(output.getOutputAmount())
                .setOutputCategory(output.getOutputCategory());
    }
    public static Output mapOutputTOtoEntity(OutputTO outputto){
        Output entity = new Output();
        entity.setOutputId(outputto.getOutputId());
        entity.setOutputDate(outputto.getOutputDate());
        entity.setOutputDescription(outputto.getOutputDescription());
        entity.setOutputAmount(outputto.getOutputAmount());
        entity.setOutputCategory(outputto.getOutputCategory());
        return entity;
    }
}
