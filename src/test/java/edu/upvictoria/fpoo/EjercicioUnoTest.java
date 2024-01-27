package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Aritmethic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EjercicioUnoTest {
    @Test
    public void sumTwoPositiveDoubles() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(34.21, aritmethic.sum(32.11, 2.1));

    }

    @Test
    public void sumTwoPositiveDoubles_2() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(51.32, aritmethic.sum(25.16, 26.16));

    }

    @Test
    public void sumTwoNegativeDoubles() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(-28.23, aritmethic.sum(-10, -18.23));

    }

    @Test
    public void sumTwoNegativeDouble_2() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(-15.15, aritmethic.sum(-14.14, -1.01));

    }

    @Test
    public void sumTwoPositiveIntegers_1() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(20, aritmethic.sum(10, 10));

    }

    @Test
    public void sumTwoPositiveIntegers_2() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(70063, aritmethic.sum(12568, 57495));

    }

    @Test
    public void sumTwoNegativeIntegers_1() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(-120, aritmethic.sum(-40, -80));

    }

    @Test
    public void sumTwoNegativeIntegers_2() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(-120965, aritmethic.sum(-120000, -965));

    }
}