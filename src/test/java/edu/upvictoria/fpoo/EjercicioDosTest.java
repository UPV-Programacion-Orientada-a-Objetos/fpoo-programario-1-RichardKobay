package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioDosTest {

    @Test
    void getAgerage_1() {
        double[] scores = {4,4,4,4};
        assertEquals(4, EjercicioDos.getAgerage(scores, scores.length));
    }

    @Test
    void getAgerage_2() {
        double[] scores = {1,2,3,4,5,6,7,8,9};
        assertEquals(5, EjercicioDos.getAgerage(scores, scores.length));
    }

    @Test
    void getAgerage_3() {
        double[] scores = {2.4,5.6,8.8,9.9,10.0};
        assertEquals(7.34, EjercicioDos.getAgerage(scores, scores.length));
    }

    @Test
    void getAgerage_4() {
        double[] scores = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.0};
        assertEquals(5.95, EjercicioDos.getAgerage(scores, scores.length));
    }
}