package oop_groupproject.britishcouncil;

import java.io.Serializable;

public class U2G6ViewDataMarks implements Serializable {
    private  String studentId, studentName, examType;
    private int marks;

    public U2G6ViewDataMarks(String studentId, String studentName, String examType, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.examType = examType;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "U2G6ViewDataMarks{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", examType='" + examType + '\'' +
                ", marks=" + marks +
                '}';
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
