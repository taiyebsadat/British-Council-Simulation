package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.util.ArrayList;

public class U2G2UpdateRole extends SystemOperationsManager implements Serializable {

    private int userId;
    private String newRole;

    public U2G2UpdateRole(String name, int id, String pass, boolean active,
                          int userId, String newRole) {
        super(name, id, pass, active);
        this.userId = userId;
        this.newRole = newRole;
    }

    public String assignRole() {

        ArrayList<Object> users = FileHelper.readObjects("users.bin");

        for (Object obj : users) {
            Staff s = (Staff) obj;
            if (s.getUserId() == userId) {
                s.setRoleType(newRole);
                return "Role Updated";
            }
        }
        return "User Not Found";
    }
}