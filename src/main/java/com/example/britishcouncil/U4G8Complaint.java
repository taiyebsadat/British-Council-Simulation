package com.example.britishcouncil;

import javafx.scene.control.ToggleGroup;

import java.io.Serializable;
import java.time.LocalDate;

public class U4G8Complaint implements Serializable {
    private String candidateId;
    private String sessionTitle;
    private ToggleGroup registrationStatus;
    private LocalDate sessionDate;
    private Integer trainingFee;

    public U4G8Complaint(String candidateId, String sessionTitle, ToggleGroup registrationStatus, LocalDate sessionDate, Integer trainingFee) {
        this.candidateId = candidateId;
        this.sessionTitle = sessionTitle;
        this.registrationStatus = registrationStatus;
        this.sessionDate = sessionDate;
        this.trainingFee = trainingFee;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getSessionTitle() {
        return sessionTitle;
    }

    public void setSessionTitle(String sessionTitle) {
        this.sessionTitle = sessionTitle;
    }

    public ToggleGroup getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(ToggleGroup registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public LocalDate getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(LocalDate sessionDate) {
        this.sessionDate = sessionDate;
    }

    public Integer getTrainingFee() {
        return trainingFee;
    }

    public void setTrainingFee(Integer trainingFee) {
        this.trainingFee = trainingFee;
    }

    @Override
    public String toString() {
        return "CseLogaComplaint{" +
                "candidateId='" + candidateId + '\'' +
                ", sessionTitle='" + sessionTitle + '\'' +
                ", registrationStatus='" + registrationStatus + '\'' +
                ", sessionDate=" + sessionDate +
                ", trainingFee=" + trainingFee +
                '}';
    }
}

