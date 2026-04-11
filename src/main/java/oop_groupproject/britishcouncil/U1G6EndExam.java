package oop_groupproject.britishcouncil;

import java.io.Serializable;

public class U1G6EndExam implements Serializable {
    private String examStatus, endTime;

    public U1G6EndExam(String examStatus, String endTime) {
        this.examStatus = examStatus;
        this.endTime = endTime;
    }

    public String getExamStatus() {
        return examStatus;
    }

    public String getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "U1G6EndExam{" +
                "examStatus='" + examStatus + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
