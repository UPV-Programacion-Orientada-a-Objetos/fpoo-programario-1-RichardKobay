package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Aritmethic;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioDosTest {

    @Test
    void getAgerage_1() {
        double[] scores = {4,4,4,4};
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(4, aritmethic.getAgerage(scores));

    }

    @Test
    void getAgerage_2() {
        double[] scores = {1,2,3,4,5,6,7,8,9};
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(5, aritmethic.getAgerage(scores));

    }

    @Test
    void getAgerage_3() {
        double[] scores = {2.4,5.6,8.8,9.9,10.0};
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(7.34, aritmethic.getAgerage(scores));

    }

    @Test
    void getAgerage_4() {
        double[] scores = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.0};
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(5.95, aritmethic.getAgerage(scores));

    }
}