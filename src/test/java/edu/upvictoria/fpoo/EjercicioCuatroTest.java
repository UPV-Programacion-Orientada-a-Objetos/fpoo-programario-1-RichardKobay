package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioCuatroTest {
    @Test
    public void getCircleArea_1() {
        assertEquals(78.53, EjercicioCuatro.getCircleArea(5));
    }

    @Test
    public void getCircleArea_2() {
        assertEquals(452.38, EjercicioCuatro.getCircleArea(12));
    }

    @Test
    public void getCircleArea_3() {
        assertEquals(314.15, EjercicioCuatro.getCircleArea(10));
    }

    @Test
    public void getCircleArea_4() {
        assertEquals(49.73, EjercicioCuatro.getCircleArea(3.979));
    }

}