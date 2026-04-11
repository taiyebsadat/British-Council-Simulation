package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.time.LocalDateTime;

public class U2G7DataMaintenance implements Serializable {
    private String actionType, status;
    private LocalDateTime timestamp;

    public U2G7DataMaintenance(String actionType, String status) {
        this.actionType = actionType;
        this.status = status;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "U2G7DataMaintenance{" +
                "actionType='" + actionType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
