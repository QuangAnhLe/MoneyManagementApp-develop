package com.java.mentor.moneymanagement.service.rest.impl;

import com.java.mentor.moneymanagement.logic.InputService;
import com.java.mentor.moneymanagement.logic.to.InputTO;
import com.java.mentor.moneymanagement.service.rest.InputController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InputControllerImpl implements InputController {

    private InputService inputService;

    public InputControllerImpl(InputService inputService) {
        this.inputService = inputService;
    }

    @GetMapping("/input")
    public List<InputTO> getInput() {
        return inputService.getInputs();
    }

    @PostMapping("/input")
    public InputTO createInput(@RequestBody InputTO inputTO) {
        return inputService.createInput(inputTO);
    }
}
