package com.example.britishcouncil;

import java.io.Serializable;
import java.time.LocalDate;

public class U3G2MockTestScore implements Serializable{
    private int TestId;
    private int StudentId;
    private String QuestionSetNo;
    private LocalDate DateOfTest;
    private float Marks;
    private String Comment;

    public U3G2MockTestScore(String comment, float marks,
                             LocalDate dateOfTest, String questionSetNo,
                             int studentId, int testId) {
        Comment = comment;
        Marks = marks;
        DateOfTest = dateOfTest;
        QuestionSetNo = questionSetNo;
        StudentId = studentId;
        TestId = testId;
    }

    public int getTestId() {
        return TestId;
    }

    public void setTestId(int testId) {
        TestId = testId;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getQuestionSetNo() {
        return QuestionSetNo;
    }

    public void setQuestionSetNo(String questionSetNo) {
        QuestionSetNo = questionSetNo;
    }

    public LocalDate getDateOfTest() {
        return DateOfTest;
    }

    public void setDateOfTest(LocalDate dateOfTest) {
        DateOfTest = dateOfTest;
    }

    public float getMarks() {
        return Marks;
    }

    public void setMarks(float marks) {
        Marks = marks;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    @Override
    public String toString() {
        return "PublishMockTestScore{" +
                "TestId=" + TestId +
                ", StudentId=" + StudentId +
                ", QuestionSetNo='" + QuestionSetNo + '\'' +
                ", DateOfTest=" + DateOfTest +
                ", Marks=" + Marks +
                ", Comment='" + Comment + '\'' +
                '}';
    }

    public String getGrade(){
        if (this.getMarks() >  70) {
            return "A";
        } else if (this.getMarks() < 80 && this.getMarks() > 69){
            return "B";
        } else if (this.getMarks() <70 && this.getMarks() > 59) {
            return "C";
        } else if (this.getMarks()<60 && this.getMarks()> 49) {
            return "D";
        } else if (this.getMarks()<50) {
            return "F";

        }
        return "";
    }
}
