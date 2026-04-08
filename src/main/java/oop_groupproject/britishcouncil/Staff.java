package oop_groupproject.britishcouncil;

public class Staff extends User {

    private String role;

    public Staff(String name, int userId, String password, boolean active, String role) {
        super(name, userId, password, active);
        this.role = role;
    }

    public String getRoleType() {
        return role;
    }

    public void setRoleType(String role) {
        this.role = role;
    }

    @Override
    public String getRole() {
        return role;
    }
}