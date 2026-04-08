package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.util.ArrayList;

public class U1G3TakeAttendance extends Invigilator implements Serializable {

    private int studentId;
    private String status;
    private int seatNo;

    public U1G3TakeAttendance(String name, int userId, String password, boolean active,
                              int studentId, String status, int seatNo) {
        super(name, userId, password, active, studentId);
        this.studentId = studentId;
        this.status = status;
        this.seatNo = seatNo;
    }

    public String saveAttendance() {

        if (!status.equalsIgnoreCase("Present") && !status.equalsIgnoreCase("Absent")) {
            return "Invalid Status";
        }

        // check duplicate seat
        ArrayList<Object> list = FileHelper.readObjects("attendance.bin");

        for (Object obj : list) {
            U1G3TakeAttendance a = (U1G3TakeAttendance) obj;
            if (a.seatNo == this.seatNo) {
                return "Seat already assigned!";
            }
        }

        FileHelper.writeObject(this, "attendance.bin");

        return "Attendance Saved";
    }
}