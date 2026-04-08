package oop_groupproject.britishcouncil;

import java.io.Serializable;

public class U1G4ReportIncident extends Invigilator implements Serializable {

    private int studentId;
    private String type;
    private String description;

    public U1G4ReportIncident(String name, int userId, String password, boolean active,
                              int studentId, String type, String description) {
        super(name, userId, password, active, studentId);
        this.studentId = studentId;
        this.type = type;
        this.description = description;
    }

    public String saveReport() {

        if (description.isEmpty()) return "Description required";

        FileHelper.writeObject(this, "incident.bin");

        return "Incident Reported";
    }
}