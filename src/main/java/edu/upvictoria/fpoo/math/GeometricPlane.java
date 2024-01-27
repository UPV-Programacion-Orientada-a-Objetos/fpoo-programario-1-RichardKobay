package edu.upvictoria.fpoo.math;

public class GeometricPlane {
    public double getDistanceBetweenTwoPoints(double x1, double x2, double y1, double y2) {
        return Math.sqrt(((x2 * x2) - (x1 * x1)) + ((y1 * y1) - (y2 * y2)));
    }
}
