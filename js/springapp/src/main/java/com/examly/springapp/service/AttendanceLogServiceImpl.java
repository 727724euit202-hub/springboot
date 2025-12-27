package com.examly.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examly.springapp.model.AttendanceLog;
import com.examly.springapp.repository.AttendanceLogRepository;

@Service
public class AttendanceLogServiceImpl implements AttendanceLogService {
    private AttendanceLogRepository attendanceLogRepo;

    public AttendanceLogServiceImpl(AttendanceLogRepository attendanceLogRepo) {
        this.attendanceLogRepo = attendanceLogRepo;
    }

    public AttendanceLog addAttendanceLog(AttendanceLog attendanceLog){
        return attendanceLogRepo.save(attendanceLog);
    }

    public AttendanceLog updAttendanceLog(Long id,AttendanceLog attendanceLog){
        AttendanceLog a = attendanceLogRepo.findById(id).orElse(null);
        a.setEmployeeCode(attendanceLog.getEmployeeCode());
        a.setDate(attendanceLog.getDate());
        a.setCheckInTime(attendanceLog.getCheckInTime());
        a.setCheckOutTime(attendanceLog.getCheckOutTime());
        return attendanceLogRepo.save(a);
    }

    public List<AttendanceLog> getAll(){
        return attendanceLogRepo.findAll();
    }

    


}
