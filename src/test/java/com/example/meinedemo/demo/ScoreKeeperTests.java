package com.example.meinedemo.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    public void test7() { // Test reaching 10 ends
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        for (int i = 0; i < 10; i++) {  // Trying to simulate 10 ends
            scoreKeeper.scoreTeamA(6);
            scoreKeeper.scoreTeamB(6);
        }
        assertTrue(scoreKeeper.getScore().startsWith("060:060"));  
    }

    @Test
    public void test8() { // Exceeding max of 10 ends
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        for (int i = 0; i < 10; i++) {  // Simulate scoring for 10 ends
            scoreKeeper.scoreTeamA(6);
            scoreKeeper.scoreTeamB(5);
            scoreKeeper.newEnd();

        }
        // Try to add more points after 10 ends
        scoreKeeper.scoreTeamA(3);
        scoreKeeper.scoreTeamB(2);
        assertEquals("060:050", scoreKeeper.getScore());
    }

    @Test
    public void test9() { // Additional round possible if scores are tied
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        for (int i = 0; i < 10; i++) {  // Simulate scoring for 10 ends
            scoreKeeper.scoreTeamA(6);
            scoreKeeper.scoreTeamB(6);
            scoreKeeper.newEnd();
        }
        // Scores are tied, simulate an extra end
        scoreKeeper.scoreTeamA(0);
        scoreKeeper.scoreTeamB(1);
        assertEquals("060:061", scoreKeeper.getScore());
    }
}
