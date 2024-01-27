package edu.upvictoria.fpoo.math;

public class Trigonometry {
    public double getHypotenuse(int a, int b) {
        return Math.sqrt((a * a) + (b * b));
    }

    public double getHypotenuse(double a, double b) {
        return Math.sqrt((a * a) + (b * b));
    }

    public double getTriangleArea (double b, double h) {
        return (b * h) / 2;
    }
}
