package com.examly.springapp.repository;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.DailyAttendanceSummary;

@Repository
public interface DailyAttendanceSummaryRepository extends JpaRepository<DailyAttendanceSummary,Long> {
   
    Page<DailyAttendanceSummary> findByEmployeeCodeAndDateBetween(String employeeCode,LocalDate start,LocalDate end,Pageable pageable);

    
}
