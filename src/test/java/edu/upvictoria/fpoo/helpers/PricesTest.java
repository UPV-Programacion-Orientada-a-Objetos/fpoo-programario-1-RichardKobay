package edu.upvictoria.fpoo.helpers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PricesTest {

    @Test
    void addPercentage_1() {
        Prices prices = new Prices();
        assertEquals(115, prices.addPercentage(100, 15));
    }

    @Test
    void addPercentage_2() {
        Prices prices = new Prices();
        assertEquals(461, prices.addPercentage(400, 15.25));
    }

    @Test
    void addPercentage_3() {
        Prices prices = new Prices();
        assertEquals(499.58, prices.addPercentage(365, 36.87));
    }

    @Test
    void addPercentage_4() {
        Prices prices = new Prices();
        assertEquals(460.96, prices.addPercentage(246.32, 87.14));
    }

    @Test
    void removePercentage_1() {
        Prices prices = new Prices();
        assertEquals(50, prices.removePercentage(100, 50));
    }

    @Test
    void removePercentage_2() {
        Prices prices = new Prices();
        assertEquals(61, prices.removePercentage(400, 84.75));
    }

    @Test
    void removePercentage_3() {
        Prices prices = new Prices();
        assertEquals(345.83, prices.removePercentage(462.65, 25.25));
    }

    @Test
    void removePercentage_4() {
        Prices prices = new Prices();
        assertEquals(60, prices.removePercentage(120, 50));
    }

}