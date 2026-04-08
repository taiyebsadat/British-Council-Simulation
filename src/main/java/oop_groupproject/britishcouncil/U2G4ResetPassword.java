package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.util.ArrayList;

public class U2G4ResetPassword extends SystemOperationsManager implements Serializable {

    private int userId;
    private String newPassword;

    public U2G4ResetPassword(String name, int id, String pass, boolean active,
                             int userId, String newPassword) {
        super(name, id, pass, active);
        this.userId = userId;
        this.newPassword = newPassword;
    }

    public String resetPassword() {

        if (newPassword.length() < 8) {
            return "Password must be at least 8 characters";
        }

        ArrayList<Object> users = FileHelper.readObjects("users.bin");

        boolean found = false;

        for (Object obj : users) {
            User u = (User) obj;

            if (u.getUserId() == userId) {
                u.setPassword(newPassword);
                found = true;
            }
        }

        if (!found) return "User Not Found";

        FileHelper.overwriteFile(users, "users.bin");

        return "Password Reset Successfully";
    }
}