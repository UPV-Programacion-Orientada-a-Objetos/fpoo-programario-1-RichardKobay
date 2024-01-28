package edu.upvictoria.fpoo.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometricPlaneTest {

    @Test
    void getDistanceBetweenTwoPoints_1() {
        GeometricPlane geometricPlane = new GeometricPlane();
        assertEquals(5, geometricPlane.getDistanceBetweenTwoPoints(3,2,6,6));
    }

    @Test
    void getDistanceBetweenTwoPoints_2() {
        GeometricPlane geometricPlane = new GeometricPlane();
        assertEquals(11.66, geometricPlane.getDistanceBetweenTwoPoints(-1,-3,5,7));
    }

    @Test
    void getDistanceBetweenTwoPoints_3() {
        GeometricPlane geometricPlane = new GeometricPlane();
        assertEquals(11.4, geometricPlane.getDistanceBetweenTwoPoints(-4,-6,-1,5));
    }

    @Test
    void getDistanceBetweenTwoPoints_4() {
        GeometricPlane geometricPlane = new GeometricPlane();
        assertEquals(0, geometricPlane.getDistanceBetweenTwoPoints(1,1,1,1));
    }

}