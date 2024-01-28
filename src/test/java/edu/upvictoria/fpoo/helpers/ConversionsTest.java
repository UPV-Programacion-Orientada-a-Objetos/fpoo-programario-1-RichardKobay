package edu.upvictoria.fpoo.helpers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionsTest {

    @Test
    void galsToLiters_1() {
        Conversions conversions = new Conversions();
        assertEquals(3.785, conversions.galsToLiters(1));
    }

    @Test
    void galsToLiters_2() {
        Conversions conversions = new Conversions();
        assertEquals(7.57, conversions.galsToLiters(2));
    }

    @Test
    void galsToLiters_3() {
        Conversions conversions = new Conversions();
        assertEquals(1135.5, conversions.galsToLiters(300));
    }

    @Test
    void galsToLiters_4() {
        Conversions conversions = new Conversions();
        assertEquals(8.44055, conversions.galsToLiters(2.23));
    }

    @Test
    void metersToInches_1() {
        Conversions conversions = new Conversions();
        assertEquals(0.03, conversions.metersToInches(1));
    }

    @Test
    void metersToInches_2() {
        Conversions conversions = new Conversions();
        assertEquals(0.10, conversions.metersToInches(4));
    }

    @Test
    void metersToInches_3() {
        Conversions conversions = new Conversions();
        assertEquals(0.07, conversions.metersToInches(2.8));
    }

    @Test
    void metersToInches_4() {
        Conversions conversions = new Conversions();
        assertEquals(0.82, conversions.metersToInches(32.265));
    }

    @Test
    void pesosToDollars_1() {
        Conversions conversions = new Conversions();
        assertEquals(0.06, conversions.pesosToDollars(1));
    }

    @Test
    void pesosToDollars_2() {
        Conversions conversions = new Conversions();
        assertEquals(1.86, conversions.pesosToDollars(32));
    }

    @Test
    void pesosToDollars_3() {
        Conversions conversions = new Conversions();
        assertEquals(0.64, conversions.pesosToDollars(11.11));
    }

    @Test
    void pesosToDollars_4() {
        Conversions conversions = new Conversions();
        assertEquals(14.69, conversions.pesosToDollars(253.25));
    }
}