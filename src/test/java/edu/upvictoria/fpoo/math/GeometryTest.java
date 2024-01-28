package edu.upvictoria.fpoo.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometryTest {

    @Test
    void getRectangleArea_1() {
        Geometry geometry = new Geometry();
        assertEquals(240,geometry.getRectangleArea(20, 12));
    }

    @Test
    void getRectangleArea_2() {
        Geometry geometry = new Geometry();
        assertEquals(12600,geometry.getRectangleArea(140, 90));
    }

    @Test
    void getRectangleArea_3() {
        Geometry geometry = new Geometry();
        assertEquals(64,geometry.getRectangleArea(8, 8));
    }

    @Test
    void getRectangleArea_4() {
        Geometry geometry = new Geometry();
        assertEquals(39.87,geometry.getRectangleArea(5.5, 7.25));
    }

    @Test
    void getCircleArea_1() {
        Geometry geometry = new Geometry();
        assertEquals(452.38,geometry.getCircleArea(12));
    }

    @Test
    void getCircleArea_2() {
        Geometry geometry = new Geometry();
        assertEquals(78.53,geometry.getCircleArea(5));
    }

    @Test
    void getCircleArea_3() {
        Geometry geometry = new Geometry();
        assertEquals(314.15,geometry.getCircleArea(10));
    }

    @Test
    void getCircleArea_4() {
        Geometry geometry = new Geometry();
        assertEquals(54.99,geometry.getCircleArea(4.184));
    }

    @Test
    void getRectangularPrismVol_1() {
        Geometry geometry = new Geometry();
        assertEquals(1000,geometry.getRectangularPrismVol(10, 10, 10));
    }

    @Test
    void getRectangularPrismVol_2() {
        Geometry geometry = new Geometry();
        assertEquals(336,geometry.getRectangularPrismVol(8,6, 7));
    }

    @Test
    void getRectangularPrismVol_3() {
        Geometry geometry = new Geometry();
        assertEquals(1320,geometry.getRectangularPrismVol(10, 11, 12));
    }

    @Test
    void getRectangularPrismVol_4() {
        Geometry geometry = new Geometry();
        assertEquals(90,geometry.getRectangularPrismVol(5, 3, 6));
    }

}