package oop_groupproject.britishcouncil;

public class Login {

    private int userId;
    private String password;

    public Login(int userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public boolean validateFormat() {
        return String.valueOf(userId).length() == 7 && password.length() >= 8;
    }

    public boolean verifyUser() {
        return userId == 1234567 && password.equals("password123");
    }
}