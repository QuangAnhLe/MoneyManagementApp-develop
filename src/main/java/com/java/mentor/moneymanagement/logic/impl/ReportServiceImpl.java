package com.java.mentor.moneymanagement.logic.impl;

import com.java.mentor.moneymanagement.dataaccess.InputRepository;
import com.java.mentor.moneymanagement.dataaccess.OutputRepository;
import com.java.mentor.moneymanagement.dataaccess.entity.Input;
import com.java.mentor.moneymanagement.dataaccess.entity.Output;
import com.java.mentor.moneymanagement.logic.ReportService;
import com.java.mentor.moneymanagement.logic.mapper.InputMapper;
import com.java.mentor.moneymanagement.logic.mapper.OutputMapper;
import com.java.mentor.moneymanagement.logic.to.InputTO;
import com.java.mentor.moneymanagement.logic.to.OutputTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportServiceImpl implements ReportService {

    private InputRepository inputRepository;
    private OutputRepository outputRepository;

    @Autowired
    public ReportServiceImpl(InputRepository inputRepository, OutputRepository outputRepository) {
        this.inputRepository = inputRepository;
        this.outputRepository = outputRepository;
    }

    /*@Autowired
    public ReportServiceImpl(OutputRepository outputRepository) {
        this.outputRepository = outputRepository;
    }*/

    @Override
    public List<InputTO> getInputs() {
        return inputRepository.findAll()
                .stream()
                .map(InputMapper::mapInputEntitytoTO)
                .collect(Collectors.toList());
    }

    @Override
    public InputTO createInput(InputTO inputTO) {
        Input entity = InputMapper.mapInputTOtoEntity(inputTO);
        Input savedInput = inputRepository.save(entity);
        return InputMapper.mapInputEntitytoTO(savedInput);
    }

    @Override
    public List<OutputTO> getOutputs() {
        return outputRepository.findAll()
                .stream()
                .map(OutputMapper::mapOutputEntitytoTO)
                .collect(Collectors.toList());
    }

    @Override
    public OutputTO createOutput(OutputTO outputTO) {
        Output entity = OutputMapper.mapOutputTOtoEntity(outputTO);
        Output savedOutput = outputRepository.save(entity);
        return OutputMapper.mapOutputEntitytoTO(savedOutput);
    }
}
