package edu.upvictoria.fpoo.math;

import edu.upvictoria.fpoo.helpers.Round;

public class GeometricPlane {
    public double getDistanceBetweenTwoPoints(double x1, double y1, double x2, double y2) {
        Round round = new Round();
        return round.roundTwoDecimals(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
    }
}
