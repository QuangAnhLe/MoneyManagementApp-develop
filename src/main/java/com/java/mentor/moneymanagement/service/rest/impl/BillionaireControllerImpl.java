package com.java.mentor.moneymanagement.service.rest.impl;

import com.java.mentor.moneymanagement.logic.BillionaireService;
import com.java.mentor.moneymanagement.logic.to.BillionaireTO;
import com.java.mentor.moneymanagement.service.rest.BillionaireController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillionaireControllerImpl implements BillionaireController {

    private BillionaireService billionaireService;

    public BillionaireControllerImpl(BillionaireService billionaireService) {
        this.billionaireService = billionaireService;
    }

    @GetMapping("hallo")
    public String hallo()
    {
        return "hallo";
    }

    @GetMapping("/bili")
    public List<BillionaireTO> getBillionare() {
        return billionaireService.getBillionaires();
    }

}
