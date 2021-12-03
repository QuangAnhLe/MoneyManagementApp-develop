package com.java.mentor.moneymanagement.logic.impl;

import com.java.mentor.moneymanagement.dataaccess.BillionaireRepository;
import com.java.mentor.moneymanagement.logic.BillionaireService;
import com.java.mentor.moneymanagement.logic.mapper.BillionareMapper;
import com.java.mentor.moneymanagement.logic.to.BillionaireTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BillionaireServiceImpl implements BillionaireService {

    private BillionaireRepository billionaireRepository;

    public BillionaireServiceImpl(BillionaireRepository billionaireRepository) {
        this.billionaireRepository = billionaireRepository;
    }

    @Override
    public List<BillionaireTO> getBillionaires() {
        return billionaireRepository.findAll()
                .stream()
                .map(BillionareMapper::mapEntitytoTO)
                .collect(Collectors.toList());
    }
}
