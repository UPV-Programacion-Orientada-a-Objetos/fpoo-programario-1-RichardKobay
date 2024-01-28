package edu.upvictoria.fpoo.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AritmethicTest {

    @Test
    void multiply_1() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(4, aritmethic.multiply(2, 2));
    }

    @Test
    void multiply_2() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(8, aritmethic.multiply(4, 2));
    }

    @Test
    void multiply_3() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(10.23, aritmethic.multiply(1.023, 10));
    }

    @Test
    void multiply_4() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(5.25, aritmethic.multiply(2.5, 2.1));
    }

    @Test
    void sum_1() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(4, aritmethic.sum(2, 2));
    }

    @Test
    void sum_2() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(82.24, aritmethic.sum(42, 40.24));
    }

    @Test
    void sum_3() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(56.25, aritmethic.sum(26.20, 30.05));
    }

    @Test
    void sum_4() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(44.44, aritmethic.sum(22.22, 22.22));
    }


    @Test
    void getPercentage_1() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(15, aritmethic.getPercentage(100, 15));
    }

    @Test
    void getPercentage_2() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(115.25, aritmethic.getPercentage(100, 115.25));
    }

    @Test
    void getPercentage_3() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(461, aritmethic.getPercentage(400, 115.25));
    }

    @Test
    void getPercentage_4() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(116.819125, aritmethic.getPercentage(462.65, 25.25));
    }

    @Test
    void getAgerage_1() {
        Aritmethic aritmethic = new Aritmethic();
        double[] scores = {12, 14, 18, 20};
        assertEquals(16, aritmethic.getAgerage(scores));
    }

    @Test
    void getAgerage_2() {
        Aritmethic aritmethic = new Aritmethic();
        double[] scores = {8, 10, 12, 14, 16};
        assertEquals(12, aritmethic.getAgerage(scores));
    }

    @Test
    void getAgerage_3() {
        Aritmethic aritmethic = new Aritmethic();
        double[] scores = {10, 13, 15, 16};
        assertEquals(13.5, aritmethic.getAgerage(scores));
    }

    @Test
    void getAgerage_4() {
        Aritmethic aritmethic = new Aritmethic();
        double[] scores = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,5 , 5, 5};
        assertEquals(5, aritmethic.getAgerage(scores));
    }
}