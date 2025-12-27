package com.examly.springapp.controller;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.DailyAttendanceSummary;
import com.examly.springapp.service.DailyAttendanceSummaryServiceImpl;



@RestController
@RequestMapping("/daily-summary")
public class DailyAttendanceSummaryController {
    
    private DailyAttendanceSummaryServiceImpl dASService;

    public DailyAttendanceSummaryController(DailyAttendanceSummaryServiceImpl dASService) {
        this.dASService = dASService;
    }

    @PostMapping("/create")
    public DailyAttendanceSummary create(@RequestBody DailyAttendanceSummary d){
        return dASService.create(d);
    }

    

    @GetMapping("/employee/code/{employeeCode}")
    public Page<DailyAttendanceSummary> findByEmployeeCodeAndDateBetweenPage(@PathVariable String employeeCode,
    @RequestParam LocalDate startDate,@RequestParam LocalDate endDate,@RequestParam int page,@RequestParam int size){
        Pageable pageable = PageRequest.of(page, size);
        return dASService.findByEmployeeCodeAndDateBetween(employeeCode, startDate, endDate, pageable);
    }

    @GetMapping("/employee/{id}")
    public Page<DailyAttendanceSummary> getSummaryByEmployeeId(@PathVariable Long id,@RequestParam int page,@RequestParam int size){
        Pageable pageable = PageRequest.of(page, size);
        return dASService.findAll(pageable);
    }




    
}
