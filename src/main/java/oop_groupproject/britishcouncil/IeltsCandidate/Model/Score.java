package oop_groupproject.britishcouncil.IeltsCandidate.Model;

public class Score {
    public String testId;
    public double score;
    public String band;

    public Score(String testId, double score, String band) {
        this.testId = testId;
        this.score = score;
        this.band = band;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }
}