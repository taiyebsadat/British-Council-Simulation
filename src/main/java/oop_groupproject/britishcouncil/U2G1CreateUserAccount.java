package oop_groupproject.britishcouncil;

import java.io.Serializable;

public class U2G1CreateUserAccount implements Serializable {
    private String userId, name, pass, email, contact, role, status;

    public U2G1CreateUserAccount(String userId, String name, String pass, String email, String contact, String role, String status) {
        this.userId = userId;
        this.name = name;
        this.pass = pass;
        this.email = email;
        this.contact = contact;
        this.role = role;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
