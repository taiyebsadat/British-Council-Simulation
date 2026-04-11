package com.example.britishcouncil;

import java.io.Serializable;

public class U3G6Announcement implements Serializable{
    private String trainerId;
    private String targetAudience;
    private String subject;
    private String messageBody;
    private String isLive;

    public U3G6Announcement(String trainerId, String targetAudience, String subject, String messageBody, String isLive) {
        this.trainerId = trainerId;
        this.targetAudience = targetAudience;
        this.subject = subject;
        this.messageBody = messageBody;
        this.isLive = isLive;
    }

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String isLive() {
        return isLive;
    }

    public void setLive(String live) {
        isLive = live;
    }

    @Override
    public String toString() {
        return "PostClassAnnouncements{" +
                "trainerId='" + trainerId + '\'' +
                ", targetAudience='" + targetAudience + '\'' +
                ", subject='" + subject + '\'' +
                ", messageBody='" + messageBody + '\'' +
                ", isLive=" + isLive +
                '}';
    }
}
