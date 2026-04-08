package oop_groupproject.britishcouncil;

import java.io.Serializable;

public class U1G6EndExam extends Invigilator implements Serializable {

    private boolean examRunning;

    public U1G6EndExam(String name, int userId, String password, boolean active, boolean examRunning) {
        super(name, userId, password, active, examRunning);
        this.examRunning = examRunning;
    }

    public String endExam() {

        if (!examRunning) {
            return "Exam not running!";
        }

        examRunning = false;

        FileHelper.writeObject(this, "examStatus.bin");

        return "Exam Ended Successfully";
    }
}