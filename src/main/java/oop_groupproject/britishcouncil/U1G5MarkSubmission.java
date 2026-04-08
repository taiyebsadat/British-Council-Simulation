package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;

public class U1G5MarkSubmission extends Invigilator implements Serializable {

    private int studentId;
    private LocalTime submissionTime;

    public U1G5MarkSubmission(String name, int userId, String password, boolean active,
                              int studentId) {
        super(name, userId, password, active, studentId);
        this.studentId = studentId;
        this.submissionTime = LocalTime.now();
    }

    public String saveSubmission() {

        // Validate exam time (simple simulation: must be within 3 hours)
        if (submissionTime.getHour() < 9 || submissionTime.getHour() > 12) {
            return "Submission outside exam time!";
        }

        ArrayList<Object> list = FileHelper.readObjects("submission.bin");

        for (Object obj : list) {
            U1G5MarkSubmission s = (U1G5MarkSubmission) obj;
            if (s.studentId == this.studentId) {
                return "Already submitted!";
            }
        }

        FileHelper.writeObject(this, "submission.bin");
        return "Submission Recorded";
    }
}