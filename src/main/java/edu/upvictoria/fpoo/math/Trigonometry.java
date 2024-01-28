package edu.upvictoria.fpoo.math;

import edu.upvictoria.fpoo.helpers.Round;

public class Trigonometry {
    public double getHypotenuse(double a, double b) {
        Round round = new Round();
        return round.round(Math.sqrt((a * a) + (b * b)), 6);
    }

    public double getTriangleArea (double b, double h) {
        Round round = new Round();
        return round.round((b * h) / 2, 6);
    }
}
