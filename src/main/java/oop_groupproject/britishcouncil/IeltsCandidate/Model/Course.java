package oop_groupproject.britishcouncil.IeltsCandidate.Model;

public class Course {
    public String courseID;
    public String title;
    public double fee;
    public String description;
    public String schedule;

    public Course(String courseID, String title, double fee, String description, String schedule) {
        this.courseID = courseID;
        this.title = title;
        this.fee = fee;
        this.description = description;
        this.schedule = schedule;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}
