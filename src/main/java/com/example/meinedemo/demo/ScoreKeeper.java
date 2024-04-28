package com.example.meinedemo.demo;

public class ScoreKeeper {
    
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    public void scoreTeamA(int points) {
        this.scoreTeamA = Math.min(6, this.scoreTeamA + points);
    }
    
    public void scoreTeamB(int points) {
        this.scoreTeamB = Math.min(6, this.scoreTeamB + points);
    }

    public String getScore() {
        return String.format("%03d:%03d", scoreTeamA, scoreTeamB);
    }
    
    public void resetScores() {
        scoreTeamA = 0;
        scoreTeamB = 0;
    }
}