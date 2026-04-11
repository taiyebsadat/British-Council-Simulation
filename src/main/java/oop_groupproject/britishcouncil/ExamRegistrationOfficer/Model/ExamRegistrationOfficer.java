package oop_groupproject.britishcouncil.ExamRegistrationOfficer.Model;

import oop_groupproject.britishcouncil.IeltsCandidate.Model.IeltsCandidate;

import java.time.LocalDate;
import java.util.ArrayList;

public class ExamRegistrationOfficer {

    public static ArrayList<Registration> registrationList = new ArrayList<>();
    public static ArrayList<RoomAllocation> allocationList = new ArrayList<>();
    public static ArrayList<IeltsCandidate> candidateList = new ArrayList<>();

    public static void createRegistration(String regID, String candID, String examID, String status, String passport) {
        Registration r = new Registration(regID,candID,examID, status, passport);
        registrationList.add(r);
    }

    public static String getRegistrationStatus(String regID) {
        for (Registration r : registrationList) {
            if (r.registrationID.equals(regID)) return r.status;
        }
        return "Not Found";
    }

    public static void assignSession(String candidateID, LocalDate date) {
        for (Registration r : registrationList) {
            if (r.candidateID.equals(candidateID)) {
                r.examDate = date;
                r.status = "Confirmed";
            }
        }
    }

    public static void updateCandidateInfo(String id, String newName) {
        for (IeltsCandidate c : candidateList) {
            if (c.candidateID.equals(id)) {
                c.name = newName; // Updating the non-user class field
                break;
            }
        }
    }

    public static void cancelRegistration(String regID) {
        registrationList.removeIf(r -> r.registrationID.equals(regID));
    }

    public ArrayList<Registration> getDailyRegistrations(LocalDate date) {
        ArrayList<Registration> dailyList = new ArrayList<>();
        for (Registration r : registrationList) {
            if (r.examDate != null && r.examDate.equals(date)) {
                dailyList.add(r);
            }
        }
        return dailyList;
    }

    public static void finalizeAllocation(String examID, String roomID, String invigilatorID) {
        RoomAllocation ra = new RoomAllocation(examID,roomID,invigilatorID);
        allocationList.add(ra);
    }
}