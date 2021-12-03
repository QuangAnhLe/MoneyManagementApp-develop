package com.java.mentor.moneymanagement.logic;

import com.java.mentor.moneymanagement.logic.to.InputTO;
import com.java.mentor.moneymanagement.logic.to.OutputTO;

import java.util.List;

public interface ReportService {

    List<InputTO> getInputs();
    InputTO createInput(InputTO inputTO);
    List<OutputTO> getOutputs();
    OutputTO createOutput(OutputTO outputTO);
}
