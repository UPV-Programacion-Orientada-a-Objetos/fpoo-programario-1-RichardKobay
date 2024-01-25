package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EjercicioUnoTest {
    @Test
    public void sumTwoPositiveDoubles() {
        assertEquals(34.21, EjercicioUno.sum(32.11, 2.1));
    }

    @Test
    public void sumTwoPositiveDoubles_2() {
        assertEquals(51.32, EjercicioUno.sum(25.16, 26.16));
    }

    @Test
    public void sumTwoNegativeDoubles() {
        assertEquals(-28.23, EjercicioUno.sum(-10, -18.23));
    }

    @Test
    public void sumTwoNegativeDouble_2() {
        assertEquals(-15.15, EjercicioUno.sum(-14.14, -1.01));
    }

    @Test
    public void sumTwoPositiveIntegers_1() {
        assertEquals(20, EjercicioUno.sum(10, 10));
    }

    @Test
    public void sumTwoPositiveIntegers_2() {
        assertEquals(70063, EjercicioUno.sum(12568, 57495));
    }

    @Test
    public void sumTwoNegativeIntegers_1() {
        assertEquals(-120, EjercicioUno.sum(-40, -80));
    }

    @Test
    public void sumTwoNegativeIntegers_2() {
        assertEquals(-120965, EjercicioUno.sum(-120000, -965));
    }
}