package com.example.britishcouncil;

import java.io.Serializable;
import java.time.LocalDate;

public class U4G2AccountIssue implements Serializable {
    private String userIdOrEmail;
    private String ticketReferenceId;
    private String issueType;
    private String description;
    private LocalDate creationDate;

    public U4G2AccountIssue(String userIdOrEmail, String ticketReferenceId,
                            String issueType, String description, LocalDate creationDate) {
        this.userIdOrEmail = userIdOrEmail;
        this.ticketReferenceId = ticketReferenceId;
        this.issueType = issueType;
        this.description = description;
        this.creationDate = creationDate;
    }

    public String getUserIdOrEmail() {
        return userIdOrEmail;
    }

    public void setUserIdOrEmail(String userIdOrEmail) {
        this.userIdOrEmail = userIdOrEmail;
    }

    public String getTicketReferenceId() {
        return ticketReferenceId;
    }

    public void setTicketReferenceId(String ticketReferenceId) {
        this.ticketReferenceId = ticketReferenceId;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "CseHandleUserAccountIssueRequest{" +
                "userIdOrEmail='" + userIdOrEmail + '\'' +
                ", ticketReferenceId='" + ticketReferenceId + '\'' +
                ", issueType='" + issueType + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
