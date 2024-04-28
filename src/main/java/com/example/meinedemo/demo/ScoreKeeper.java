package com.example.meinedemo.demo;

public class ScoreKeeper {
    
    private int totalScoreTeamA = 0;
    private int totalScoreTeamB = 0;
    private int endCount = 0;
    private boolean gameEnd = false;

    public void scoreTeamA(int points) {
        if (gameEnd || endCount >= 10 && totalScoreTeamA != totalScoreTeamB) {
            return;
        }
        totalScoreTeamA += Math.min(6, points);
        checkGameEnd();
    }
    
    public void scoreTeamB(int points) {
        if (gameEnd || endCount >= 10 && totalScoreTeamA != totalScoreTeamB) {
            return;
        }
        totalScoreTeamB += Math.min(6, points);
        checkGameEnd();
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
        if (endCount < 10 || totalScoreTeamA == totalScoreTeamB) {
            endCount++;
        }
    }

    private void checkGameEnd() {
        if (endCount > 10 && totalScoreTeamA != totalScoreTeamB) {
            gameEnd = true;
        }
    }
}