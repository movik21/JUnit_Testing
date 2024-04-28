package com.example.meinedemo.demo;

public class ScoreKeeper {
    
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int totalScoreTeamA = 0;
    private int totalScoreTeamB = 0;

    public void scoreTeamA(int points) {
        scoreTeamA = Math.min(6, points);
        totalScoreTeamA += scoreTeamA;
    }
    
    public void scoreTeamB(int points) {
        scoreTeamB = Math.min(6, points);
        totalScoreTeamB += scoreTeamB;
    }

    public String getScore() {
        return String.format("%03d:%03d", totalScoreTeamA, totalScoreTeamB);
    }
    
    public void resetScores() {
        totalScoreTeamA = 0;
        totalScoreTeamB = 0;
    }
}