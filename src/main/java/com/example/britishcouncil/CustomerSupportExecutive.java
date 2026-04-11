package com.example.britishcouncil;

import java.time.LocalDate;

public class CustomerSupportExecutive extends User{

    private String customerSentiment;
    private String attachmentUrl;
    private boolean isEscalated;
    private LocalDate lastInteractionDate;
    private String assignedBatchId;

    public CustomerSupportExecutive(String userId, String password, String role, String customerSentiment, String attachmentUrl, boolean isEscalated, LocalDate lastInteractionDate, String assignedBatchId) {
        super(userId, password, role);
        this.customerSentiment = customerSentiment;
        this.attachmentUrl = attachmentUrl;
        this.isEscalated = isEscalated;
        this.lastInteractionDate = lastInteractionDate;
        this.assignedBatchId = assignedBatchId;
    }

    public String getCustomerSentiment() {
        return customerSentiment;
    }

    public void setCustomerSentiment(String customerSentiment) {
        this.customerSentiment = customerSentiment;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    public boolean isEscalated() {
        return isEscalated;
    }

    public void setEscalated(boolean escalated) {
        isEscalated = escalated;
    }

    public LocalDate getLastInteractionDate() {
        return lastInteractionDate;
    }

    public void setLastInteractionDate(LocalDate lastInteractionDate) {
        this.lastInteractionDate = lastInteractionDate;
    }

    public String getAssignedBatchId() {
        return assignedBatchId;
    }

    public void setAssignedBatchId(String assignedBatchId) {
        this.assignedBatchId = assignedBatchId;
    }

    @Override
    public String toString() {
        return "CustomerSupportExecutive{" +
                "customerSentiment='" + customerSentiment + '\'' +
                ", attachmentUrl='" + attachmentUrl + '\'' +
                ", isEscalated=" + isEscalated +
                ", lastInteractionDate=" + lastInteractionDate +
                ", assignedBatchId='" + assignedBatchId + '\'' +
                '}';
    }
}
