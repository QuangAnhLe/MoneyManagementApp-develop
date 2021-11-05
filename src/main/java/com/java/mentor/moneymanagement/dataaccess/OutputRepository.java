package com.java.mentor.moneymanagement.dataaccess;

import com.java.mentor.moneymanagement.dataaccess.entity.Output;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutputRepository extends JpaRepository<Output,Long> {
}
