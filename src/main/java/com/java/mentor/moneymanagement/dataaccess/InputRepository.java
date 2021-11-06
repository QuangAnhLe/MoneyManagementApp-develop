package com.java.mentor.moneymanagement.dataaccess;

import com.java.mentor.moneymanagement.dataaccess.entity.Billionaire;
import com.java.mentor.moneymanagement.dataaccess.entity.Input;
import com.java.mentor.moneymanagement.logic.to.InputTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InputRepository extends JpaRepository<Input,Long> {
    // used
}
