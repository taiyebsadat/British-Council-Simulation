package oop_groupproject.britishcouncil;

import java.io.Serializable;

public class U2G4ResetPassword implements Serializable {
    private String userId, newPassword;

    public U2G4ResetPassword(String userId, String newPassword) {
        this.userId = userId;
        this.newPassword = newPassword;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getUserId() {
        return userId;
    }

    public String getNewPassword() {
        return newPassword;
    }
}
