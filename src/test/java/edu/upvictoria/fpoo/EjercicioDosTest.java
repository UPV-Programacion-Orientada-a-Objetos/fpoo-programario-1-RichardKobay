package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioDosTest {

    @Test
    void getAgerage_1() {
        double[] scores = {4,4,4,4};
        assertEquals(4, EjercicioDos.getAgerage(scores, 4));
    }
}