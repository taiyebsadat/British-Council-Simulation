package com.example.britishcouncil;

import java.io.Serializable;

public class U3G4StudentFeedback implements Serializable{
    private String trainerId;
    private String studentId;
    private String studentName;
    private String feedbackComments;
    private String priorityLevel;
    private String isVisible;

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFeedbackComments() {
        return feedbackComments;
    }

    public void setFeedbackComments(String feedbackComments) {
        this.feedbackComments = feedbackComments;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String isVisible() {
        return isVisible;
    }

    public void setVisible(String visible) {
        isVisible = visible;
    }

    public U3G4StudentFeedback(String trainerId, String studentId, String studentName, String feedbackComments, String priorityLevel, String isVisible) {
        this.trainerId = trainerId;
        this.studentId = studentId;
        this.studentName = studentName;
        this.feedbackComments = feedbackComments;
        this.priorityLevel = priorityLevel;
        this.isVisible = isVisible;
    }

    @Override
    public String toString() {
        return "ProvideStudentFeedback{" +
                "trainerId='" + trainerId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", feedbackComments='" + feedbackComments + '\'' +
                ", priorityLevel='" + priorityLevel + '\'' +
                ", isVisible=" + isVisible +
                '}';
    }
}
