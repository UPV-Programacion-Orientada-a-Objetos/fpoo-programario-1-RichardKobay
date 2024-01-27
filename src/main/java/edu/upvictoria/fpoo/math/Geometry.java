package edu.upvictoria.fpoo.math;

public class Geometry {
    public double getRectangleArea(double b, double h) {
        if (b < 0 || h < 0) {
            System.out.println("One or more of the numbers are negative, we changed its value for its abs val.");
            b = Math.abs(b);
            h = Math.abs(h);
        }
        return Math.floor((b * h) * 100) / 100;
    }

    public int getRectangleArea(int b, int h) {
        if (b < 0 || h < 0) {
            System.out.println("One or more of the numbers are negative, we changed its value for its abs val.");
            b = Math.abs(b);
            h = Math.abs(h);
        }
        return (int) Math.floor((b * h) * 100) / 100;
    }

    public double getCircleArea(double r) {
        return Math.floor((Math.PI * (r * r)) * 100) / 100;
    }

    public double getRectangularPrismVol(double height, double width, double length) {
        return height * width * length;
    }
}
