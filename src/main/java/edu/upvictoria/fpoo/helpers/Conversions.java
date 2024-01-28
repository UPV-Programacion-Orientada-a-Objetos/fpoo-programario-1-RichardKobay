package edu.upvictoria.fpoo.helpers;

public class Conversions {
    public double galsToLiters(double gal) {
        return gal * 3.785;
    }

    public double metersToInches(double m) {
        Round round = new Round();
        return round.roundTwoDecimals(m * 0.0254);
    }

    public double pesosToDollars(double pesos) {
        Round round = new Round();
        return round.roundTwoDecimals(pesos * 0.058);
    }
}
