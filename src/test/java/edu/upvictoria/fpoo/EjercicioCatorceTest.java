package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioCatorceTest {

    @Test
    void getAge_1() {
        EjercicioCatorce ejercicioCatorce = new EjercicioCatorce(true);
        assertEquals(20, ejercicioCatorce.getAge(2024, 2004));
    }

    @Test
    void getAge_2() {
        EjercicioCatorce ejercicioCatorce = new EjercicioCatorce(true);
        assertEquals(26, ejercicioCatorce.getAge(2024, 1998));
    }

    @Test
    void getAge_3() {
        EjercicioCatorce ejercicioCatorce = new EjercicioCatorce(true);
        assertEquals(10, ejercicioCatorce.getAge(2010, 2000));
    }

    @Test
    void getAge_4() {
        EjercicioCatorce ejercicioCatorce = new EjercicioCatorce(true);
        assertEquals(25, ejercicioCatorce.getAge(2028, 2003));
    }

}