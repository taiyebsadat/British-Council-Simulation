package com.example.britishcouncil;

import java.io.Serializable;

public class U3G8PaymentSlip implements Serializable {
    private String trainerId;
    private String month;
    private String year;
    private String payslipText;


    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPayslipText() {
        return payslipText;
    }

    public void setPayslipText(String payslipText) {
        this.payslipText = payslipText;
    }

    @Override
    public String toString() {
        return "ViewPaymentSlip{" +
                "trainerId='" + trainerId + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", payslipText='" + payslipText + '\'' +
                '}';
    }

    public U3G8PaymentSlip(String trainerId, String month, String year, String payslipText) {
        this.trainerId = trainerId;
        this.month = month;
        this.year = year;
        this.payslipText = payslipText;
    }
}

