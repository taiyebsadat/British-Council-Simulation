package oop_groupproject.britishcouncil;

import java.io.Serializable;

public class U1G3TakeAttendance implements Serializable {
    private String studentId, seatNo;
    private boolean isPresent;

    public U1G3TakeAttendance(String studentId, String seatNo, boolean isPresent) {
        this.studentId = studentId;
        this.seatNo = seatNo;
        this.isPresent = isPresent;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public boolean isPresent() {
        return isPresent;
    }
}