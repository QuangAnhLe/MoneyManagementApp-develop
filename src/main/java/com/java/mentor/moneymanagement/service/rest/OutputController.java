package com.java.mentor.moneymanagement.service.rest;

import com.java.mentor.moneymanagement.logic.to.OutputTO;

import java.util.List;

public interface OutputController {

    List<OutputTO> getOutput();
}
