package com.java.mentor.moneymanagement.service.rest.impl;

import com.java.mentor.moneymanagement.logic.OutputService;
import com.java.mentor.moneymanagement.logic.to.OutputTO;
import com.java.mentor.moneymanagement.service.rest.OutputController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OutputControllerImpl implements OutputController {

    private OutputService outputService;

    public OutputControllerImpl(OutputService outputService) {
        this.outputService = outputService;
    }

    @GetMapping("/getOutput")
    public List<OutputTO> getOutput() {
        return outputService.getOutputs();
    }
}
