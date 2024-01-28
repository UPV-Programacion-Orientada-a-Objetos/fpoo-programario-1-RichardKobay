package edu.upvictoria.fpoo.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrigonometryTest {

    @Test
    void getHypotenuse_1() {
        Trigonometry trigonometry = new Trigonometry();
        assertEquals(4.472136, trigonometry.getHypotenuse(2, 4));
    }

    @Test
    void getHypotenuse_2() {
        Trigonometry trigonometry = new Trigonometry();
        assertEquals(55.901699, trigonometry.getHypotenuse(25, 50));
    }

    @Test
    void getHypotenuse_3() {
        Trigonometry trigonometry = new Trigonometry();
        assertEquals(2.828427, trigonometry.getHypotenuse(2, 2));
    }

    @Test
    void getHypotenuse_4() {
        Trigonometry trigonometry = new Trigonometry();
        assertEquals(13, trigonometry.getHypotenuse(5, 12));
    }

    @Test
    void getTriangleArea_1() {
        Trigonometry trigonometry = new Trigonometry();
        assertEquals(100, trigonometry.getTriangleArea(10, 20));
    }

    @Test
    void getTriangleArea_2() {
        Trigonometry trigonometry = new Trigonometry();
        assertEquals(3.9, trigonometry.getTriangleArea(3, 2.6));
    }

    @Test
    void getTriangleArea_3() {
        Trigonometry trigonometry = new Trigonometry();
        assertEquals(36, trigonometry.getTriangleArea(8, 9));
    }

    @Test
    void getTriangleArea_4() {
        Trigonometry trigonometry = new Trigonometry();
        assertEquals(24, trigonometry.getTriangleArea(6, 8));
    }

}