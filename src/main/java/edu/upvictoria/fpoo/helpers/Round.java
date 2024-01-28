package edu.upvictoria.fpoo.helpers;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Round {
    public double roundTwoDecimals (Double n) {
        return new BigDecimal(n.toString()).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public double round(double value, int places) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
