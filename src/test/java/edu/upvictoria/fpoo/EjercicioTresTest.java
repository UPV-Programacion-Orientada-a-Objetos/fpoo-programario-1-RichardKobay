package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Geometry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioTresTest {

    @Test
    void getRectangleArea_1() {
        Geometry geometry = new Geometry();
        assertEquals(100, geometry.getRectangleArea(10,10));

    }

    @Test
    void getRectangleArea_2() {
        Geometry geometry = new Geometry();
        assertEquals(6.25, geometry.getRectangleArea(2.5,2.5));

    }

    @Test
    void getRectangleArea_3() {
        Geometry geometry = new Geometry();
        assertEquals(50, geometry.getRectangleArea(5,10));

    }

    @Test
    void getRectangleArea_4() {
        Geometry geometry = new Geometry();
        assertEquals(3246.40, geometry.getRectangleArea(26.126,124.2597));

    }
}