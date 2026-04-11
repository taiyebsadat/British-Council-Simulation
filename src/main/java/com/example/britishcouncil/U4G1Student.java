package com.example.britishcouncil;

import java.io.Serializable;
import java.time.LocalDate;

public class U4G1Student implements Serializable {
    private String studentName;
    private String passportNumber;
    private String courseType;
    private String emailAddress;
    private LocalDate dob;

    public U4G1Student(String studentName, String passportNumber, String courseType, String emailAddress, LocalDate dob) {
        this.studentName = studentName;
        this.passportNumber = passportNumber;
        this.courseType = courseType;
        this.emailAddress = emailAddress;
        this.dob = dob;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "CseAddNewStudent{" +
                "studentName='" + studentName + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", courseType='" + courseType + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", dob=" + dob +
                '}';
    }
}
