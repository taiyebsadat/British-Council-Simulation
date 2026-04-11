package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.time.LocalDateTime;

public class U1G2ManageTimer implements Serializable {
    private LocalDateTime startTime;
    private int durationMinutes;

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public U1G2ManageTimer(LocalDateTime startTime, int durationMinutes) {
        this.startTime = startTime;
        this.durationMinutes = durationMinutes;
    }
}