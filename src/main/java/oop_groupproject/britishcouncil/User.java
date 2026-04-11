package oop_groupproject.britishcouncil;

import java.io.Serializable;

public class User implements Serializable {
    private String userId, password, role;

    public User(String userId, String password, String role) {
        this.userId = userId;
        this.password = password;
        this.role = role;
    }

    // Getters
    public String getUserId() {
        return userId;
    }
    public String getPassword() {
        return password;
    }
    public String getRole() {
        return role;
    }

    // Setters
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}