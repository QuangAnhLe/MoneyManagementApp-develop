package com.java.mentor.moneymanagement.logic;

import com.java.mentor.moneymanagement.dataaccess.entity.Input;
import com.java.mentor.moneymanagement.dataaccess.entity.Output;
import com.java.mentor.moneymanagement.logic.to.InputTO;
import com.java.mentor.moneymanagement.logic.to.OutputTO;

import java.util.List;

public interface OutputService {

    List<OutputTO> getOutputs();
    OutputTO createOutput(OutputTO outputTO);
    OutputTO updateOutput(OutputTO outputTO, Long outputId) throws IllegalStateException;
    void deleteOutput(Long outputId);
}
