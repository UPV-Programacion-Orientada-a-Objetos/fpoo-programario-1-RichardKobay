package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioSeisTest {

    @Test
    void calculateArea_1() {
        EjercicioSeis ejercicioSeis = new EjercicioSeis(true);
        assertEquals(57.129999999999995, ejercicioSeis.calculateArea(8, 4));
    }

    @Test
    void calculateArea_2() {
        EjercicioSeis ejercicioSeis = new EjercicioSeis(true);
        assertEquals(228.53, ejercicioSeis.calculateArea(16, 8));
    }

    @Test
    void calculateArea_3() {
        EjercicioSeis ejercicioSeis = new EjercicioSeis(true);
        assertEquals(453.495, ejercicioSeis.calculateArea(16.2, 12.6));
    }

    @Test
    void calculateArea_4() {
        EjercicioSeis ejercicioSeis = new EjercicioSeis(true);
        assertEquals(8227.236, ejercicioSeis.calculateArea(126.8232, 42.5));
    }

}