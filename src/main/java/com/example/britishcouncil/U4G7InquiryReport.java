package com.example.britishcouncil;

import java.io.Serializable;
import java.time.LocalDate;

public class U4G7InquiryReport implements Serializable {
    private String reportId, category, priority ,status, assignedOfficer, description;
    private LocalDate createdDate;

    public U4G7InquiryReport(String reportId, String category, String priority, String status,
                             String assignedOfficer, String description, LocalDate createdDate) {
        this.reportId = reportId;
        this.category = category;
        this.priority = priority;
        this.status = status;
        this.assignedOfficer = assignedOfficer;
        this.description = description;
        this.createdDate = createdDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignedOfficer() {
        return assignedOfficer;
    }

    public void setAssignedOfficer(String assignedOfficer) {
        this.assignedOfficer = assignedOfficer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    @Override
    public String toString() {
        return "CseDailyInquiryReport{" +
                "reportId='" + reportId + '\'' +
                ", category='" + category + '\'' +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                ", assignedOfficer='" + assignedOfficer + '\'' +
                ", description='" + description + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
