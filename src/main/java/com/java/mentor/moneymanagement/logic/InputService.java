package com.java.mentor.moneymanagement.logic;

import com.java.mentor.moneymanagement.dataaccess.entity.Input;
import com.java.mentor.moneymanagement.logic.to.InputTO;

import java.util.List;

public interface InputService {

    List<InputTO> getInputs();
    InputTO createInput(InputTO inputTO);
    InputTO updateInput(InputTO inputTO, Long inputId) throws IllegalStateException;
    void deleteInput(Long inputId);
}
