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
    public void sumTwoNegativeDoubles () {
        assertEquals(-28.23, EjercicioUno.sum(-10, -18.23));
    }

    @Test
    public void sumTwoNegativeDouble_2() {
        assertEquals(-15.15, EjercicioUno.sum(-14.14, -1.01));
    }


    @org.junit.jupiter.api.Test
    void sum() {
    }
}