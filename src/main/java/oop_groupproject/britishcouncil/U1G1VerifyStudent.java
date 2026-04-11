package oop_groupproject.britishcouncil;

import java.io.Serializable;

public class U1G1VerifyStudent implements Serializable {
    private String studentID;

    public U1G1VerifyStudent(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }
}
