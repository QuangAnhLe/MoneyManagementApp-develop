package com.java.mentor.moneymanagement.service.REST.impl;

import com.java.mentor.moneymanagement.logic.BillionaireService;
import com.java.mentor.moneymanagement.logic.InputService;
import com.java.mentor.moneymanagement.logic.to.BillionaireTO;
import com.java.mentor.moneymanagement.logic.to.InputTO;
import com.java.mentor.moneymanagement.service.REST.InputController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InputControllerImpl implements InputController {

    private InputService inputService;



    @GetMapping("input")
    public String hallo()
    {
        return "input";
    }

    @GetMapping("/getinput")
    public List<InputTO> getInput() {
        return inputService.getInputs();
    }
}
