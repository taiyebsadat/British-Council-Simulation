package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.time.LocalDateTime;

public class U2G5MonitorInvigilator implements Serializable {
    private String materialType;
    private LocalDateTime requestTime;

    public U2G5MonitorInvigilator(String materialType, LocalDateTime requestTime) {
        this.materialType = materialType;
        this.requestTime = requestTime;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public LocalDateTime getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(LocalDateTime requestTime) {
        this.requestTime = requestTime;
    }
}

