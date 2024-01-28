package edu.upvictoria.fpoo.helpers;

import edu.upvictoria.fpoo.math.Aritmethic;

public class Prices {
    public double addPercentage(double initial, double percentage) {
        Aritmethic aritmethic = new Aritmethic();
        Round round = new Round();
        return round.roundTwoDecimals(initial + aritmethic.getPercentage(initial, percentage));
    }

    public double removePercentage (double initial, double percentage) {
        Aritmethic aritmethic = new Aritmethic();
        Round round = new Round();
        return round.roundTwoDecimals(initial - aritmethic.getPercentage(initial, percentage));
    }
}
