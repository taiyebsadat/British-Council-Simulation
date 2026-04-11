package com.example.britishcouncil;

import java.io.Serializable;

public class U3G1LectureMaterial implements Serializable {
    private String trainerId;
    private String batchId;
    private String materialTittle;
    private String contentDescription;
    private String filePath;

    public U3G1LectureMaterial(String trainerId, String batchId, String materialTittle, String contentDescription, String filePath) {
        this.trainerId = trainerId;
        this.batchId = batchId;
        this.materialTittle = materialTittle;
        this.contentDescription = contentDescription;
        this.filePath = filePath;
    }

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getMaterialTittle() {
        return materialTittle;
    }

    public void setMaterialTittle(String materialTittle) {
        this.materialTittle = materialTittle;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "UploadPracticeMaterial{" +
                "trainerId='" + trainerId + '\'' +
                ", batchId='" + batchId + '\'' +
                ", materialTittle='" + materialTittle + '\'' +
                ", contentDescription='" + contentDescription + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
