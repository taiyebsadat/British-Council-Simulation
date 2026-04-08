package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.util.ArrayList;

public class U2G6ViewDataMarks extends SystemOperationsManager implements Serializable {

    private int targetId;

    public U2G6ViewDataMarks(String name, int id, String pass, boolean active, int targetId) {
        super(name, id, pass, active);
        this.targetId = targetId;
    }

    public String getUserData() {

        ArrayList<Object> users = FileHelper.readObjects("users.bin");

        for (Object obj : users) {
            User u = (User) obj;

            if (u.getUserId() == targetId) {
                return "Name: " + u.getName()
                        + "\nRole: " + u.getRole()
                        + "\nActive: " + u.isActive();
            }
        }

        return "User Not Found";
    }
}