package edu.upvictoria.fpoo.helpers;

import edu.upvictoria.fpoo.math.Geometry;

public class Conagua {
    public double getTotalPerCubicMeter(double m3, double pricePerM3) {
        return m3 * pricePerM3;
    }

    public double getPoolPrice(double waterPrice, double height, double width, double length) {
        Geometry geometry = new Geometry();
        return waterPrice * geometry.getRectangularPrismVol(height, length, width);
    }
}
