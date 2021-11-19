package com.java.mentor.moneymanagement.service.rest.impl;

import com.java.mentor.moneymanagement.dataaccess.entity.Input;
import com.java.mentor.moneymanagement.dataaccess.entity.Output;
import com.java.mentor.moneymanagement.logic.OutputService;
import com.java.mentor.moneymanagement.logic.to.InputTO;
import com.java.mentor.moneymanagement.logic.to.OutputTO;
import com.java.mentor.moneymanagement.service.rest.OutputController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OutputControllerImpl implements OutputController {

    private OutputService outputService;

    public OutputControllerImpl(OutputService outputService) {
        this.outputService = outputService;
    }

    @GetMapping("/output")
    public List<OutputTO> getOutput() {
        return outputService.getOutputs();
    }

    @PostMapping( "/output")
    public OutputTO createOutput(@RequestBody OutputTO outputTO) {
        return outputService.createOutput(outputTO);
    }

    @PutMapping("/output/{id}")
    public OutputTO updateOutput(@RequestBody OutputTO outputTO, @PathVariable Long id){
        try {
            return outputService.updateOutput(outputTO, id);
        }catch (IllegalStateException illegalStateException ){
            return new OutputTO();
        }
    }
    @DeleteMapping("/output/{id}")
    public void deleteOutput(@PathVariable Long id) {
        outputService.deleteOutput(id);
    }
}
