package com.example.britishcouncil;

public class IeltsTrainer extends User{

    private String expertModule;
    private Double averageBandScore;
    private int maxStudentCapacity;
    private int sessionDuration;

    public IeltsTrainer(String userId, String password, String role, String expertModule, Double averageBandScore, int maxStudentCapacity, int sessionDuration) {
        super(userId, password, role);
        this.expertModule = expertModule;
        this.averageBandScore = averageBandScore;
        this.maxStudentCapacity = maxStudentCapacity;
        this.sessionDuration = sessionDuration;
    }

    public String getExpertModule() {
        return expertModule;
    }

    public void setExpertModule(String expertModule) {
        this.expertModule = expertModule;
    }

    public Double getAverageBandScore() {
        return averageBandScore;
    }

    public void setAverageBandScore(Double averageBandScore) {
        this.averageBandScore = averageBandScore;
    }

    public int getMaxStudentCapacity() {
        return maxStudentCapacity;
    }

    public void setMaxStudentCapacity(int maxStudentCapacity) {
        this.maxStudentCapacity = maxStudentCapacity;
    }

    public int getSessionDuration() {
        return sessionDuration;
    }

    public void setSessionDuration(int sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    @Override
    public String toString() {
        return "IeltsTrainer{" +
                "expertModule='" + expertModule + '\'' +
                ", averageBandScore=" + averageBandScore +
                ", maxStudentCapacity=" + maxStudentCapacity +
                ", sessionDuration=" + sessionDuration +
                '}';
    }
}
