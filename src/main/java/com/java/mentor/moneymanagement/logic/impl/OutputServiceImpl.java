package com.java.mentor.moneymanagement.logic.impl;

import com.java.mentor.moneymanagement.dataaccess.OutputRepository;
import com.java.mentor.moneymanagement.logic.OutputService;
import com.java.mentor.moneymanagement.logic.mapper.OutputMapper;
import com.java.mentor.moneymanagement.logic.to.OutputTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class OutputServiceImpl implements OutputService {

    private OutputRepository outputRepository;

    public OutputServiceImpl(OutputRepository outputRepository) {
        this.outputRepository = outputRepository;
    }

    @Override
    public List<OutputTO> getOutputs() {
        return outputRepository.findAll()
                .stream()
                .map(OutputMapper::mapOutputEntitytoTO)
                .collect(Collectors.toList());
    }
}
