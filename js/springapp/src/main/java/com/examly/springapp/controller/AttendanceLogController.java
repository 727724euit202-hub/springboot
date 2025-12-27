package com.examly.springapp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.AttendanceLog;
import com.examly.springapp.service.AttendanceLogServiceImpl;

@RestController
@RequestMapping("/attendancelogs")
public class AttendanceLogController {
    private AttendanceLogServiceImpl attendanceLogServiceImpl;

    

    public AttendanceLogController(AttendanceLogServiceImpl attendanceLogServiceImpl) {
        this.attendanceLogServiceImpl = attendanceLogServiceImpl;
    }



    @PostMapping
    public ResponseEntity<AttendanceLog> addAttendanceLog(@RequestBody AttendanceLog attendanceLog){
        AttendanceLog a=attendanceLogServiceImpl.addAttendanceLog(attendanceLog);
        return ResponseEntity.status(HttpStatus.CREATED).body(a);
    }

    @PutMapping("/{id}")
    public AttendanceLog update(@PathVariable Long id,@RequestBody AttendanceLog attendanceLog){
        return attendanceLogServiceImpl.updAttendanceLog(id, attendanceLog);
    }

    @GetMapping
    public List<AttendanceLog> getAll(){
        return attendanceLogServiceImpl.getAll();
    }


}
