package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioCincoTest {

    @Test
    void getFullArea_1() {
        EjercicioCinco ejercicioCinco = new EjercicioCinco(true);
        assertEquals(52.5, ejercicioCinco.getFullArea(10, 7, 5));
    }

    @Test
    void getFullArea_2() {
        EjercicioCinco ejercicioCinco = new EjercicioCinco(true);
        assertEquals(900, ejercicioCinco.getFullArea(40, 30, 20));
    }

    @Test
    void getFullArea_3() {
        EjercicioCinco ejercicioCinco = new EjercicioCinco(true);
        assertEquals(155.9275, ejercicioCinco.getFullArea(15, 12.23, 10.5));
    }

    @Test
    void getFullArea_4() {
        EjercicioCinco ejercicioCinco = new EjercicioCinco(true);
        assertEquals(3125, ejercicioCinco.getFullArea(83, 50, 42));
    }

}