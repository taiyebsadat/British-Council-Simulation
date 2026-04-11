package oop_groupproject.britishcouncil;

import java.io.Serializable;

public class U2G2UpdateRole implements Serializable {
    private String userId, newRole;

    public U2G2UpdateRole(String userId, String newRole) {
        this.userId = userId;
        this.newRole = newRole;
    }

    public String getNewRole() {
        return newRole;
    }

    public void setNewRole(String newRole) {
        this.newRole = newRole;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
