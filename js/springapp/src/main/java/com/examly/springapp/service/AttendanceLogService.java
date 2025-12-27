package com.examly.springapp.service;

import java.util.List;

import com.examly.springapp.model.AttendanceLog;

public interface AttendanceLogService {
    public AttendanceLog addAttendanceLog(AttendanceLog attendanceLog);
    public AttendanceLog updAttendanceLog(Long id,AttendanceLog attendanceLog);
    public List<AttendanceLog> getAll();
}
