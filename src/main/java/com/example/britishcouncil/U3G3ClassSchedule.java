package com.example.britishcouncil;

import java.io.Serializable;
import java.time.LocalDate;

public class U3G3ClassSchedule implements Serializable{
    private String trainerId;
    private LocalDate classDate;
    private String classTime;
    private String roomNumber;
    private String topicsToCover;


    public U3G3ClassSchedule(String trainerId, LocalDate classDate, String classTime, String roomNumber, String topicsToCover) {
        this.trainerId = trainerId;
        this.classDate = classDate;
        this.classTime = classTime;
        this.roomNumber = roomNumber;
        this.topicsToCover = topicsToCover;
    }

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    public LocalDate getClassDate() {
        return classDate;
    }

    public void setClassDate(LocalDate classDate) {
        this.classDate = classDate;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getTopicsToCover() {
        return topicsToCover;
    }

    public void setTopicsToCover(String topicsToCover) {
        this.topicsToCover = topicsToCover;
    }

    @Override
    public String toString() {
        return "ViewUpcomingClassSchedule{" +
                "trainerId='" + trainerId + '\'' +
                ", classDate='" + classDate + '\'' +
                ", classTime='" + classTime + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", topicsToCover='" + topicsToCover + '\'' +
                '}';
    }
}

