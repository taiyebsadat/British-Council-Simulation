package com.example.britishcouncil;

import java.io.Serializable;

public class U4G4FAQ implements Serializable {
    private String question;
    private String answer;
    private String category;
    private String updateBy;

    public U4G4FAQ(String question, String answer, String category, String updateBy) {
        this.question = question;
        this.answer = answer;
        this.category = category;
        this.updateBy = updateBy;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        return "CseUpdateFAQ{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", category='" + category + '\'' +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}
