package com.java.mentor.moneymanagement.logic.impl;

import com.java.mentor.moneymanagement.dataaccess.OutputRepository;
import com.java.mentor.moneymanagement.dataaccess.entity.Input;
import com.java.mentor.moneymanagement.dataaccess.entity.Output;
import com.java.mentor.moneymanagement.logic.OutputService;
import com.java.mentor.moneymanagement.logic.mapper.InputMapper;
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

    @Override
    public OutputTO createOutput(OutputTO outputTO) {
        Output entity = OutputMapper.mapOutputTOtoEntity(outputTO);
        Output savedOutput = outputRepository.save(entity);
        return OutputMapper.mapOutputEntitytoTO(savedOutput);
    }

    @Override
    public OutputTO updateOutput(OutputTO outputTO, Long outputId) {
        Output updatedOutput = outputRepository.findById(outputId)
                .map(output->{
                    output.setOutputDate(outputTO.getOutputDate());
                    output.setOutputDescription(outputTO.getOutputDescription());
                    output.setOutputAmount(outputTO.getOutputAmount());
                    output.setOutputCategory(outputTO.getOutputCategory());
                    return outputRepository.save(output);
                })
                .orElseThrow(() -> {
                        return new IllegalStateException("no find ID");
                    });
        return OutputMapper.mapOutputEntitytoTO(updatedOutput);
    }

    @Override
    public void deleteOutput(Long outputId) {
        outputRepository.deleteById(outputId);
    }
}
