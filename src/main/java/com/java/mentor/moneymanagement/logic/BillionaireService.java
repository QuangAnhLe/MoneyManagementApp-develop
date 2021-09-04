package com.java.mentor.moneymanagement.logic;

import com.java.mentor.moneymanagement.dataaccess.entity.Billionaire;
import com.java.mentor.moneymanagement.logic.to.BillionaireTO;

import java.util.List;

public interface BillionaireService {

    List<BillionaireTO> getBillionaires();
}
