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

}
