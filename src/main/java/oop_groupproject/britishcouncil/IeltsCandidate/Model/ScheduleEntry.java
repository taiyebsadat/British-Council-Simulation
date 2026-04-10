package oop_groupproject.britishcouncil.IeltsCandidate.Model;

public class ScheduleEntry {
    public String date;
    public String time;
    public String courseName;

    public ScheduleEntry(String date, String time, String courseName) {
        this.date = date;
        this.time = time;
        this.courseName = courseName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
