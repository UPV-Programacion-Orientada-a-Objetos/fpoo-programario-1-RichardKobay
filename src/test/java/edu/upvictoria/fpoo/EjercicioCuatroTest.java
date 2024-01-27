package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Geometry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioCuatroTest {
    @Test
    public void getCircleArea_1() {
        Geometry geometry = new Geometry();
        assertEquals(78.53, geometry.getCircleArea(5));
    }

    @Test
    public void getCircleArea_2() {
        Geometry geometry = new Geometry();
        assertEquals(452.38, geometry.getCircleArea(12));
    }

    @Test
    public void getCircleArea_3() {
        Geometry geometry = new Geometry();
        assertEquals(314.15, geometry.getCircleArea(10));
    }

    @Test
    public void getCircleArea_4() {
        Geometry geometry = new Geometry();
        assertEquals(49.73, geometry.getCircleArea(3.979));
    }

}