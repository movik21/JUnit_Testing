package com.example.meinedemo.demo;

public class ScoreKeeper {
    
    private int scoreTeamA;

    public void scoreTeamA(int points) {
        this.scoreTeamA += points;
    }
    
    //TBD void scoreTeamB()

    public String getScore() {
        return String.format("%03d:000", scoreTeamA);
    }
    
}