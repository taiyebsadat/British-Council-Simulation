package com.example.britishcouncil;

import java.io.Serializable;
import java.time.LocalDate;

public class U3G5StudyResource implements Serializable {
    private String trainerId;
    private String batchId;
    private LocalDate postDate;
    private String resourceLink;

    public U3G5StudyResource(String trainerId, String batchId, LocalDate postDate, String resourceLink) {
        this.trainerId = trainerId;
        this.batchId = batchId;
        this.postDate = postDate;
        this.resourceLink = resourceLink;
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

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    public String getResourceLink() {
        return resourceLink;
    }

    public void setResourceLink(String resourceLink) {
        this.resourceLink = resourceLink;
    }


    @Override
    public String toString() {
        return "PostStudyResourceLink{" +
                "trainerId='" + trainerId + '\'' +
                ", batchId='" + batchId + '\'' +
                ", postDate=" + postDate +
                ", resourceLink='" + resourceLink + '\'' +
                '}';
    }
}
