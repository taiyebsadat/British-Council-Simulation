package oop_groupproject.britishcouncil.ExamRegistrationOfficer.Model;

public class RoomAllocation {
    public String examID;
    public String roomID;
    public String invigilatorID;

    public RoomAllocation(String examID, String roomID, String invigilatorID) {
        this.examID = examID;
        this.roomID = roomID;
        this.invigilatorID = invigilatorID;
    }

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getInvigilatorID() {
        return invigilatorID;
    }

    public void setInvigilatorID(String invigilatorID) {
        this.invigilatorID = invigilatorID;
    }
}