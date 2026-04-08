package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.util.ArrayList;

public class U2G3DeleteUser extends SystemOperationsManager implements Serializable {

    private int targetId;

    public U2G3DeleteUser(String name, int id, String pass, boolean active, int targetId) {
        super(name, id, pass, active);
        this.targetId = targetId;
    }

    public String deleteUser() {

        ArrayList<Object> users = FileHelper.readObjects("users.bin");
        ArrayList<Object> updatedList = new ArrayList<>();

        boolean found = false;

        for (Object obj : users) {
            User u = (User) obj;

            if (u.getUserId() == targetId) {
                found = true;
                continue;
            }

            updatedList.add(u);
        }

        if (!found) return "User Not Found";

        FileHelper.overwriteFile(updatedList, "users.bin");

        return "User Deleted Successfully";
    }
}