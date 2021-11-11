package com.java.mentor.moneymanagement.service.rest;

import com.java.mentor.moneymanagement.dataaccess.entity.Input;
import com.java.mentor.moneymanagement.logic.to.InputTO;

import java.util.List;

public interface InputController {

    List<InputTO> getInput();
    Input updateInput(InputTO inputTO, Long inputId);
    InputTO createInput(InputTO inputTO);
    void deleteInput(Long inputId);
}
