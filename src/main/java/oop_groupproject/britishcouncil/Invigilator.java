package oop_groupproject.britishcouncil;

public class Invigilator extends Staff {

    public Invigilator(String name, int userId, String password, boolean active, int studentId) {
        super(name, userId, password, active, "Invigilator");
    }
}