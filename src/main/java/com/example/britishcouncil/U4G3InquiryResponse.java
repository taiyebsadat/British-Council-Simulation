package com.example.britishcouncil;

import java.io.Serializable;

public class U4G3InquiryResponse implements Serializable {
    private String inquiryId;
    private String senderName;
    private String queryText;
    private String responseText;
    private boolean status;
    private String resolutionTime;


    public String getInquiryId() {
        return inquiryId;
    }

    public void setInquiryId(String inquiryId) {
        this.inquiryId = inquiryId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getResolutionTime() {
        return resolutionTime;
    }

    public void setResolutionTime(String resolutionTime) {
        this.resolutionTime = resolutionTime;
    }

    @Override
    public String toString() {
        return "CseRespondtoInquiries{" +
                "inquiryId='" + inquiryId + '\'' +
                ", senderName='" + senderName + '\'' +
                ", queryText='" + queryText + '\'' +
                ", responseText='" + responseText + '\'' +
                ", status=" + status +
                ", resolutionTime=" + resolutionTime +
                '}';
    }

    public U4G3InquiryResponse(String inquiryId, String senderName, String queryText, String responseText, boolean status, String resolutionTime) {
        this.inquiryId = inquiryId;
        this.senderName = senderName;
        this.queryText = queryText;
        this.responseText = responseText;
        this.status = status;
        this.resolutionTime = resolutionTime;
    }
}


