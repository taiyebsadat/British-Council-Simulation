package oop_groupproject.britishcouncil;

import java.io.Serializable;

public class U2G3DeleteUser implements Serializable {
    private String userId;

    public U2G3DeleteUser(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
