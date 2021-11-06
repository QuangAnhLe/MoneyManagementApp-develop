package com.java.mentor.moneymanagement.logic;

import com.java.mentor.moneymanagement.logic.to.InputTO;

import java.util.List;

public interface InputService {

    List<InputTO> getInputs();
    InputTO createInput(InputTO inputTO);

    /*createInput
     deleteInput
    updateInput*/


}
