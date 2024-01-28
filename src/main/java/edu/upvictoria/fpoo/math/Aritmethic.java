package edu.upvictoria.fpoo.math;

import edu.upvictoria.fpoo.helpers.Round;
import org.jetbrains.annotations.NotNull;

public class Aritmethic {
    public double multiply(double a, double b) {
        Round round = new Round();
        return round.round(a * b, 8);
    }

    public double multiply(double a, int b) {
        Round round = new Round();
        return round.round(a * b, 8);
    }

    public double sum(int a, int b) {
        return (int) (a + b);
    }

    public double sum(double a, double b) {
        Round round = new Round();
        return round.round(a + b, 8);
    }

    public double getPercentage(double a, double b) {
        Round round = new Round();
        return round.round((b / 100) * a, 6);
    }

    public double getAgerage(double @NotNull [] scores) {
        double average = 0;
        for (double score : scores)
            average += score;

        average = average / scores.length;

        return Math.floor(average * 100) / 100;
    }
}
