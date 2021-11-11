package com.java.mentor.moneymanagement.service.rest;

import com.java.mentor.moneymanagement.dataaccess.entity.Input;
import com.java.mentor.moneymanagement.dataaccess.entity.Output;
import com.java.mentor.moneymanagement.logic.to.InputTO;
import com.java.mentor.moneymanagement.logic.to.OutputTO;

import java.util.List;

public interface OutputController {

    List<OutputTO> getOutput();
    OutputTO createOutput(OutputTO outputTO);
    Output updateOutput(OutputTO outputTO, Long outputId);
    void deleteOutput(Long outputId);
}
