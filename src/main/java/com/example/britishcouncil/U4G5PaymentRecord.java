package com.example.britishcouncil;

import java.io.Serializable;
import java.time.LocalDate;

public class U4G5PaymentRecord implements Serializable {
    private String transactionId;
    private String studentId;
    private boolean status;
    private boolean amount;
    private Integer paymentDate;


    public U4G5PaymentRecord(String transactionId, String studentId, boolean status, boolean amount, Integer paymentDate) {
        this.transactionId = transactionId;
        this.studentId = studentId;
        this.status = status;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isAmount() {
        return amount;
    }

    public void setAmount(boolean amount) {
        this.amount = amount;
    }

    public Integer getPaymentDate() {
        return paymentDate;
    }

    @Override
    public String toString() {
        return "U4G5PaymentRecord{" +
                "transactionId='" + transactionId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", status=" + status +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                '}';
    }

    public void setPaymentDate(Integer paymentDate) {
        this.paymentDate = paymentDate;
    }
}


