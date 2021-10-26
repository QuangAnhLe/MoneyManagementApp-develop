package com.java.mentor.moneymanagement.dataaccess;

import com.java.mentor.moneymanagement.dataaccess.entity.Billionaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutputRepository extends JpaRepository<Billionaire,Long> {
}
