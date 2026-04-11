package com.example.britishcouncil;

import java.io.Serializable;

public class U4G6ContactUpdate implements Serializable {
    private String studentName;
    private String studentId;
    private String phoneNumber;

    public U4G6ContactUpdate(String studentName, String studentId, String phoneNumber) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.phoneNumber = phoneNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "CseUpdateStudentContactInfo{" +
                "studentName='" + studentName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
