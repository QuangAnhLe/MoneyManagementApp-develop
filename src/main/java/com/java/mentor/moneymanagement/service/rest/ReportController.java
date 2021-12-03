package com.java.mentor.moneymanagement.service.rest;

import com.java.mentor.moneymanagement.logic.to.InputTO;
import com.java.mentor.moneymanagement.logic.to.OutputTO;

import java.util.List;

public interface ReportController {
    List<InputTO> getInput();
    InputTO updateInput(InputTO inputTO, Long inputId);
    List<OutputTO> getOutput();
    OutputTO createOutput(OutputTO outputTO);
}
