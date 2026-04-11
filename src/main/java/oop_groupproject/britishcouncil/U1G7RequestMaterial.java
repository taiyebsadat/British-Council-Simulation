package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.time.LocalDateTime;

public class U1G7RequestMaterial implements Serializable {
    private String materialType;
    private LocalDateTime requestTime;

    public U1G7RequestMaterial(String materialType) {
        this.materialType = materialType;
        this.requestTime = LocalDateTime.now();
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

    @Override
    public String toString() {
        return "Request: " + materialType + " | Time: " + requestTime;
    }
}
