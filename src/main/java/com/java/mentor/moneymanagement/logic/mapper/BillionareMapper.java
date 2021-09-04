package com.java.mentor.moneymanagement.logic.mapper;

import com.java.mentor.moneymanagement.dataaccess.entity.Billionaire;
import com.java.mentor.moneymanagement.logic.to.BillionaireTO;

public class BillionareMapper {

    public static BillionaireTO mapEntitytoTO(Billionaire billionaire){
        return new BillionaireTO()
                .setId(billionaire.getId())
                .setFirstName(billionaire.getFirstName())
                .setLastName(billionaire.getLastName())
                .setCareer(billionaire.getCareer());
    }
}
