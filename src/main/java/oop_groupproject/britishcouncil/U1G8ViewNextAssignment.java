package oop_groupproject.britishcouncil;

import java.io.Serializable;

public class U1G8ViewNextAssignment implements Serializable {
    private String date, room, examName;

    public U1G8ViewNextAssignment(String date, String room, String examName) {
        this.date = date;
        this.room = room;
        this.examName = examName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    @Override
    public String toString() {
        return "Exam: " + examName + "\nDate: " + date + "\nRoom: " + room + "\n-------------------";
    }
}
