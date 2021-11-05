package com.java.mentor.moneymanagement.logic.mapper;

import com.java.mentor.moneymanagement.dataaccess.entity.Output;
import com.java.mentor.moneymanagement.logic.to.OutputTO;

public class OutputMapper {

    public static OutputTO mapOutputEntitytoTO(Output output){
        return new OutputTO()
                .setOutputId(output.getOutputId())
                .setOutputDate(output.getOutputDate())
                .setOutputDescription(output.getOutputDescription())
                .setOutputAmount(output.getOutputAmount());
    }
}
