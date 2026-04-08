package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.util.ArrayList;

public class U2G7DataMaintenance extends SystemOperationsManager implements Serializable {

    public U2G7DataMaintenance(String name, int id, String pass, boolean active) {
        super(name, id, pass, active);
    }

    public String cleanData() {

        ArrayList<Object> users = FileHelper.readObjects("users.bin");
        ArrayList<Object> activeUsers = new ArrayList<>();

        int removed = 0;

        for (Object obj : users) {
            User u = (User) obj;

            if (u.isActive()) {
                activeUsers.add(u);
            } else {
                removed++;
            }
        }

        FileHelper.overwriteFile(activeUsers, "users.bin");

        return removed + " inactive users removed";
    }
}