package com.java.mentor.moneymanagement.service.rest.impl;

import com.java.mentor.moneymanagement.dataaccess.entity.Input;
import com.java.mentor.moneymanagement.logic.InputService;
import com.java.mentor.moneymanagement.logic.to.InputTO;
import com.java.mentor.moneymanagement.service.rest.InputController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InputControllerImpl implements InputController {

    private InputService inputService;

    public InputControllerImpl(InputService inputService) {
        this.inputService = inputService;
    }

    @GetMapping( "/input")
    public List<InputTO> getInput() {
        return inputService.getInputs();
    }
    @PostMapping( "/input")
    public InputTO createInput(@RequestBody InputTO inputTO) {
        return inputService.createInput(inputTO);
    }
    @PutMapping("/input/{id}")
    public Input updateInput(@RequestBody InputTO inputTO, @PathVariable Long id){
        return inputService.updateInput(inputTO, id);
    }
    @DeleteMapping("/input/{id}")
    public void deleteInput(@PathVariable Long id) {
        inputService.deleteInput(id);
    }
}
