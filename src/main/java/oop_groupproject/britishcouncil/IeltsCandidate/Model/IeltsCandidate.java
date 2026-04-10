package oop_groupproject.britishcouncil.IeltsCandidate.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class IeltsCandidate {

    public String candidateID;
    public  String name;

    public static ArrayList<Course> enrolledCourses = new ArrayList<>();
    public static ArrayList<Score> scoreList = new ArrayList<>();
    public static ArrayList<PaymentRecord> paymentList = new ArrayList<>();
    public static ArrayList<ScheduleEntry> scheduleList = new ArrayList<>();

    public static void enrollInCourse(String id, String title, double fee, String desc, String sched) {
        Course c = new Course(id, title, fee, desc, sched);
        enrolledCourses.add(c);
    }

    public static void addPayment(String pID, String cID, String meth, LocalDate date, double amt) {
        PaymentRecord p = new PaymentRecord(pID, cID, meth, date, amt);
        paymentList.add(p);
    }

    public static void submitHomework(String taskID, String status) {
        System.out.println("Task " + taskID + " submitted with status: " + status);
    }

    public static void addTestScore(String testID, double val, String band) {
        Score s = new Score(testID, val, band);
        scoreList.add(s);
    }

    public static void downloadInvoice(String paymentID) {
        System.out.println("Generating Invoice for Payment ID: " + paymentID);
    }
}