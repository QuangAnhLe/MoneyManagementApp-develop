package com.java.mentor.moneymanagement.service.rest.impl;

import com.java.mentor.moneymanagement.logic.InputService;
import com.java.mentor.moneymanagement.logic.OutputService;
import com.java.mentor.moneymanagement.logic.to.InputTO;
import com.java.mentor.moneymanagement.logic.to.OutputTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportControllerImpl {

    private InputService inputService;
    private OutputService outputService;

    @Autowired
    public ReportControllerImpl(InputService inputService, OutputService outputService) {
        this.inputService = inputService;
        this.outputService = outputService;
    }


   /*@Autowired
    public ReportControllerImpl(OutputService outputService) {
        this.outputService = outputService;
    }*/


    @GetMapping( "/reportinput")
    public List<InputTO> getInput() {
        return inputService.getInputs();
    }

    @PostMapping( "/reportinput")
    public InputTO createInput(@RequestBody InputTO inputTO) {
        return inputService.createInput(inputTO);
    }

    @GetMapping("/reportoutput")
    public List<OutputTO> getOutput() {
        return outputService.getOutputs();
    }

    @PostMapping( "/reportoutput")
    public OutputTO createOutput(@RequestBody OutputTO outputTO) {
        return outputService.createOutput(outputTO);
    }


}
