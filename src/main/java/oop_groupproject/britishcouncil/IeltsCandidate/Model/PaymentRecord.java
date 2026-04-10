package oop_groupproject.britishcouncil.IeltsCandidate.Model;

import java.time.LocalDate;

public class PaymentRecord {
    public String paymentID;
    public String courseID;
    public String method;
    public LocalDate date;
    public double amount;

    public PaymentRecord(String paymentID, String courseID, String method, LocalDate date, double amount) {
        this.paymentID = paymentID;
        this.courseID = courseID;
        this.method = method;
        this.date = date;
        this.amount = amount;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
