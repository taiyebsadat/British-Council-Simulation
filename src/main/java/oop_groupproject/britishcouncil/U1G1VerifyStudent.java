package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.util.ArrayList;

public class U1G1VerifyStudent extends Invigilator implements Serializable {

    private int studentId;
    private String status;

    public U1G1VerifyStudent(String name, int userId, String password, boolean active, int studentId) {
        super(name, userId, password, active, studentId);
        this.studentId = studentId;
    }

    public String verify() {
        ArrayList<Object> list = FileHelper.readObjects("students.bin");

        for (Object obj : list) {
            Student s = (Student) obj;
            if (s.getUserId() == studentId) {
                status = "Allowed for Exam";
                return status;
            }
        }

        status = "Rejected - Not Registered";
        return status;
    }

    public String getStatus() {
        return status;
    }
}