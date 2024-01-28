package edu.upvictoria.fpoo.helpers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConaguaTest {

    @Test
    void getTotalPerCubicMeter_1() {
        Conagua conagua = new Conagua();
        assertEquals(30, conagua.getTotalPerCubicMeter(3, 10));
    }

    @Test
    void getTotalPerCubicMeter_2() {
        Conagua conagua = new Conagua();
        assertEquals(150.22, conagua.getTotalPerCubicMeter(7, 21.46));
    }

    @Test
    void getTotalPerCubicMeter_3() {
        Conagua conagua = new Conagua();
        assertEquals(170.5, conagua.getTotalPerCubicMeter(34.1, 5));
    }

    @Test
    void getTotalPerCubicMeter_4() {
        Conagua conagua = new Conagua();
        assertEquals(120.46, conagua.getTotalPerCubicMeter(60.23, 2));
    }


    @Test
    void getPoolPrice_1() {
        Conagua conagua = new Conagua();
        assertEquals(10000, conagua.getPoolPrice(10, 10, 10, 10));
    }

    @Test
    void getPoolPrice_2() {
        Conagua conagua = new Conagua();
        assertEquals(384, conagua.getPoolPrice(4, 2, 6, 8));
    }

    @Test
    void getPoolPrice_3() {
        Conagua conagua = new Conagua();
        assertEquals(3808578.48, conagua.getPoolPrice(15.23, 51.23, 64.11, 76.14));
    }

    @Test
    void getPoolPrice_4() {
        Conagua conagua = new Conagua();
        assertEquals(13793.77, conagua.getPoolPrice(5.2, 6.8, 9.14, 42.68));
    }

}