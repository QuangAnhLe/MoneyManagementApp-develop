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

    @Override
    public InputTO updateInput(InputTO inputTO, Long inputId) {
        Input updatedInput = inputRepository.findById(inputId)
                .map(input->{
                    input.setInputDate(inputTO.getInputDate());
                    input.setInputDescription(inputTO.getInputDescription());
                    input.setInputAmount(inputTO.getInputAmount());
                    input.setInputCategory(inputTO.getInputCategory());
                    return inputRepository.save(input);
                })
                .orElseThrow(() -> {
                    return new IllegalStateException("no find ID");
                });
        return InputMapper.mapInputEntitytoTO(updatedInput);
    }

    @Override
    public void deleteInput(Long inputId) {
        inputRepository.deleteById(inputId);
    }
}

//.orElseThrow(()->new ResourceNotFoundException("User with ID :"+id+" Not Found!"));
//
//                user.setId(puser.getId());