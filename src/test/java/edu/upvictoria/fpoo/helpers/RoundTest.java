package edu.upvictoria.fpoo.helpers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundTest {

    @Test
    void round_1() {
        Round round = new Round();
        assertEquals(2.22, round.round(2.22300000001, 2));
    }

    @Test
    void round_2() {
        Round round = new Round();
        assertEquals(2.223, round.round(2.22300000001, 3));
    }

    @Test
    void round_3() {
        Round round = new Round();
        assertEquals(2.224, round.round(2.22370000001, 3));
    }

    @Test
    void round_4() {
        Round round = new Round();
        assertEquals(5.7, round.round(5.72300000001, 1));
    }

    @Test
    void roundTwoDecimals_1() {
        Round round = new Round();
        assertEquals(2.23, round.roundTwoDecimals(2.231));
    }

    @Test
    void roundTwoDecimals_2() {
        Round round = new Round();
        assertEquals(2.28, round.roundTwoDecimals(2.277));
    }

    @Test
    void roundTwoDecimals_3() {
        Round round = new Round();
        assertEquals(2.23, round.roundTwoDecimals(2.230000000001));
    }

    @Test
    void roundTwoDecimals_4() {
        Round round = new Round();
        assertEquals(672.32, round.roundTwoDecimals(672.32332412341235));
    }

}