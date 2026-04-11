package oop_groupproject.britishcouncil;

import java.io.Serializable;

public class U1G4ReportIncident implements Serializable {
    private String studentId, incidentType, description, reportStatusLabel;

    public U1G4ReportIncident(String studentId, String incidentType, String description) {
        this.studentId = studentId;
        this.incidentType = incidentType;
        this.description = description;
        this.reportStatusLabel = reportStatusLabel;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getincidentType() {
        return incidentType;
    }

    public String getDescription() {
        return description;
    }

}
