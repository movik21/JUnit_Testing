package com.example.meinedemo.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class ScoreKeeperTests {

    @Test
    public void test1() { // initial score is zero
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        assertEquals("000:000", scoreKeeper.getScore());
    }
    @Test
    public void test2() { // One point for Team A
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA(1);
        assertEquals("001:000", scoreKeeper.getScore());
    }
    @Test
    public void test3() { // One point for Team B
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB(1);
        assertEquals("000:001", scoreKeeper.getScore());
    }
    @Test
    public void test4() { // Max points per end - Team A
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA(7); // Wrong input will be corrected automatically
        scoreKeeper.scoreTeamB(2);
        assertEquals("006:002", scoreKeeper.getScore()); 
    }

    @Test
    public void test5() { // Max points per end - Team B
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA(3); 
        scoreKeeper.scoreTeamB(100); // Wrong input will be corrected automatically
        assertEquals("003:006", scoreKeeper.getScore()); 
    }

    @Test
    public void test6() { // Reset scores
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA(3);
        scoreKeeper.scoreTeamB(2);
        scoreKeeper.resetScores();
        assertEquals("000:000", scoreKeeper.getScore());
    }

}
