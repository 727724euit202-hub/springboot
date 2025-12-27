package com.examly.springapp.service;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.DailyAttendanceSummary;
import com.examly.springapp.repository.DailyAttendanceSummaryRepository;

import jakarta.transaction.Transactional;



@Service
public class DailyAttendanceSummaryServiceImpl implements DailyAttendanceSummaryService{
    private DailyAttendanceSummaryRepository dASRepo;

    public DailyAttendanceSummaryServiceImpl(DailyAttendanceSummaryRepository dASRepo) {
        this.dASRepo = dASRepo;
    }
    
   @Transactional
    public DailyAttendanceSummary create(DailyAttendanceSummary d){
        return dASRepo.save(d);
    }

    public Page<DailyAttendanceSummary> findByEmployeeCodeAndDateBetween(String code,LocalDate start,LocalDate end,Pageable pageable){
        return dASRepo.findByEmployeeCodeAndDateBetween(code,start,end,pageable);
    }

    public Page<DailyAttendanceSummary> findAll(Pageable pageable){
        return dASRepo.findAll(pageable);
    }

    
}
