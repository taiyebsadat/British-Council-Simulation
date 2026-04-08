package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.time.LocalTime;

public class U1G2ManageExamTimer extends Invigilator implements Serializable {

    private int durationMinutes;
    private LocalTime startTime;
    private boolean running;

    public U1G2ManageExamTimer(String name, int userId, String password, boolean active) {
        super(name, userId, password, active, studentId);
    }

    public String startTimer(int duration) {
        if (duration <= 0) {
            return "Invalid duration";
        }

        this.durationMinutes = duration;
        this.startTime = LocalTime.now();
        this.running = true;

        return "Timer Started";
    }

    public String stopTimer() {
        if (!running) return "Timer not running";

        running = false;
        return "Timer Stopped";
    }

    public String getRemainingTime() {
        if (!running) return "Timer not running";

        long elapsed = java.time.Duration.between(startTime, LocalTime.now()).toMinutes();
        long remaining = durationMinutes - elapsed;

        if (remaining <= 0) {
            running = false;
            return "Exam Finished";
        }

        return remaining + " minutes remaining";
    }
}