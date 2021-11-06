package com.java.mentor.moneymanagement.service.rest;

import com.java.mentor.moneymanagement.logic.to.InputTO;

import java.util.List;

public interface InputController {

    List<InputTO> getInput();
    InputTO createInput(InputTO inputTO);
}
