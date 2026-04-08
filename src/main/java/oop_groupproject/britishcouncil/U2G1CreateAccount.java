package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.util.ArrayList;

public class U2G1CreateAccount extends SystemOperationsManager implements Serializable {

    private String newName;
    private int newId;
    private String email;
    private String phone;

    public U2G1CreateAccount(String name, int userId, String password, boolean active,
                             String newName, int newId, String email, String phone) {
        super(name, userId, password, active);
        this.newName = newName;
        this.newId = newId;
        this.email = email;
        this.phone = phone;
    }

    public String createAccount() {

        if (newName.isEmpty() || email.isEmpty() || phone.isEmpty()) {
            return "Fields cannot be empty";
        }

        if (String.valueOf(newId).length() != 7) {
            return "ID must be 7 digits";
        }

        ArrayList<Object> users = FileHelper.readObjects("users.bin");

        for (Object obj : users) {
            User u = (User) obj;
            if (u.getUserId() == newId) {
                return "User ID already exists";
            }
        }

        String tempPass = "temp1234";

        Staff newUser = new Staff(newName, newId, tempPass, true, "Invigilator");

        FileHelper.writeObject(newUser, "users.bin");

        return "Account Created. Temp Password: " + tempPass;
    }
}