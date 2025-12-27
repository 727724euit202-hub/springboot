package com.examly.springapp.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class AttendanceRecord {
    @Id
    private int attendenceRecordId;

    @Column
    private int employeeCode;

    @Column
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private AttendanceLogStatus status;



}
