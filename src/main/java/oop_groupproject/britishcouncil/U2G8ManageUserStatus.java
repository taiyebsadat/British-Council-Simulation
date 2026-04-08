package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.util.ArrayList;

public class U2G8ManageUserStatus extends SystemOperationsManager implements Serializable {

    private int userId;
    private boolean newStatus;

    public U2G8ManageUserStatus(String name, int id, String pass, boolean active,
                                int userId, boolean newStatus) {
        super(name, id, pass, active);
        this.userId = userId;
        this.newStatus = newStatus;
    }

    public String updateStatus() {

        ArrayList<Object> users = FileHelper.readObjects("users.bin");

        boolean found = false;

        for (Object obj : users) {
            User u = (User) obj;

            if (u.getUserId() == userId) {
                u.setActive(newStatus);
                found = true;
            }
        }

        if (!found) return "User Not Found";

        FileHelper.overwriteFile(users, "users.bin");

        return "User Status Updated";
    }
}