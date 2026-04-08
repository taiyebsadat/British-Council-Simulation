package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.util.ArrayList;

public class U1G8ViewAssignment extends Invigilator implements Serializable {

    public U1G8ViewAssignment(String name, int userId, String password, boolean active) {
        super(name, userId, password, active, studentId);
    }

    public String viewAssignment() {

        ArrayList<Object> list = FileHelper.readObjects("assignment.bin");

        if (list.isEmpty()) return "No Assignment Found";

        U1G8ViewAssignment a = (U1G8ViewAssignment) list.get(list.size() - 1);

        return "Next Exam: Room 302, 10:00 AM";
    }
}