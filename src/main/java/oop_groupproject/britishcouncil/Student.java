package oop_groupproject.britishcouncil;

public class Student extends User {
    private String role;

    public Student(String name, int userId, String password, boolean active, String role) {
        super(name, userId, password, active);
        this.role = role;
    }

    @Override
    public String getRole() {
        return role;
    }
}