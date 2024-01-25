package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioTresTest {

    @Test
    void getRectangleArea_1() {
        assertEquals(100, EjercicioTres.getRectangleArea(10,10));
    }

    @Test
    void getRectangleArea_2() {
        assertEquals(6.25, EjercicioTres.getRectangleArea(2.5,2.5));
    }

    @Test
    void getRectangleArea_3() {
        assertEquals(50, EjercicioTres.getRectangleArea(5,10));
    }

    @Test
    void getRectangleArea_4() {
        assertEquals(3246.40, EjercicioTres.getRectangleArea(26.126,124.2597));
    }
}