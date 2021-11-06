package com.java.mentor.moneymanagement.logic.impl;

import com.java.mentor.moneymanagement.dataaccess.InputRepository;
import com.java.mentor.moneymanagement.dataaccess.entity.Input;
import com.java.mentor.moneymanagement.logic.InputService;
import com.java.mentor.moneymanagement.logic.mapper.InputMapper;
import com.java.mentor.moneymanagement.logic.to.InputTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InputServiceImpl implements InputService {

    private InputRepository inputRepository;

    public InputServiceImpl(InputRepository inputRepository) {
        this.inputRepository = inputRepository;
    }

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
}