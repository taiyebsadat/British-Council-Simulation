package com.example.britishcouncil;

import java.io.Serializable;
import java.time.LocalDate;

public class U3G7LeaveRequest  {
    private String trainerId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String leaveReason;
    private String description;
    private String status;

    public U3G7LeaveRequest(String trainerId, LocalDate startDate, LocalDate endDate,
                            String leaveReason, String description, String status) {
        this.trainerId = trainerId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.leaveReason = leaveReason;
        this.description = description;
        this.status = status;
    }

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RequestLeave{" +
                "trainerId='" + trainerId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", leaveReason='" + leaveReason + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
