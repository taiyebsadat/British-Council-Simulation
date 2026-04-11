package oop_groupproject.britishcouncil.ExamRegistrationOfficer.Model;

import java.time.LocalDate;

// Entity for Registrations
public class Registration {
    public String registrationID;
    public String candidateID;
    public String examID;
    public String status;
    public LocalDate examDate;
    public String passportNum;

    public Registration(String registrationID, String candidateID, String examID, String status, String passportNum) {
        this.registrationID = registrationID;
        this.candidateID = candidateID;
        this.examID = examID;
        this.status = status;
        this.passportNum = passportNum;
    }

    public String getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(String candidateID) {
        this.candidateID = candidateID;
    }

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }
}