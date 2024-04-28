package com.example.meinedemo.demo;

public class ScoreKeeper {
    
    private int totalScoreTeamA = 0;
    private int totalScoreTeamB = 0;
    private int endCount = 0;

    public void scoreTeamA(int points) {
        if (endCount >= 10 && totalScoreTeamA != totalScoreTeamB) {
            return;
        }
        totalScoreTeamA += Math.min(6, points);
    }
    
    public void scoreTeamB(int points) {
        if (endCount >= 10 && totalScoreTeamA != totalScoreTeamB) {
            return;
        }
        totalScoreTeamB += Math.min(6, points);
    }

    public String getScore() {
        return String.format("%03d:%03d", totalScoreTeamA, totalScoreTeamB);
    }
    
    public void resetScores() {
        totalScoreTeamA = 0;
        totalScoreTeamB = 0;
        endCount = 0;
    }

    public void newEnd() {
        endCount++;
    }
}