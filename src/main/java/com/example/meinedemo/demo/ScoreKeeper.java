package com.example.meinedemo.demo;

public class ScoreKeeper {
    
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    public void scoreTeamA(int points) {
        if (points > 6) {
            this.scoreTeamA += 6;
        } else {
            this.scoreTeamA += points;
        }
    }
    
    public void scoreTeamB(int points) {
        if (points > 6) {
            this.scoreTeamA += 6;
        } else {
            this.scoreTeamB += points;
        }
    }

    public String getScore() {
        return String.format("%03d:%03d", scoreTeamA, scoreTeamB);
    }
    
}