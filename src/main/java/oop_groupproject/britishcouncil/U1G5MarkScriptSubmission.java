package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.time.LocalDateTime;

public class U1G5MarkScriptSubmission implements Serializable {
    private String studentId;
    private LocalDateTime submissionTime;

    public U1G5MarkScriptSubmission(String studentId) {
        this.studentId = studentId;
        this.submissionTime = submissionTime.now();
    }

    public String getStudentId() {
        return studentId;
    }

    public LocalDateTime getSubmissionTime() {
        return submissionTime;
    }

}
