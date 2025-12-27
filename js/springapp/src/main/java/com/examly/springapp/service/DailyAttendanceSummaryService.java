package com.examly.springapp.service;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.examly.springapp.model.DailyAttendanceSummary;

public interface DailyAttendanceSummaryService {
    public DailyAttendanceSummary create(DailyAttendanceSummary d);
    public Page<DailyAttendanceSummary> findByEmployeeCodeAndDateBetween(String code,LocalDate start,LocalDate end,Pageable pageable);
    public Page<DailyAttendanceSummary> findAll(Pageable pageable);
}
