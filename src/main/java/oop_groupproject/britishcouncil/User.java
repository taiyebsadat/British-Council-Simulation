package oop_groupproject.britishcouncil;

import java.io.Serializable;

public abstract class User implements Serializable {

    private String name;
    private int userId;
    private String password;
    private boolean active;

    public User(String name, int userId, String password, boolean active) {
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.active = active;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // Polymorphism
    public abstract String getRole();
}