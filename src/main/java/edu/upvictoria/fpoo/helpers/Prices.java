package edu.upvictoria.fpoo.helpers;

import edu.upvictoria.fpoo.math.Aritmethic;

public class Prices {
    public int addPercentage(int initial, int percentage) {
        Aritmethic aritmethic = new Aritmethic();
        return initial + aritmethic.getPercentage(initial, percentage);
    }

    public double addPercentage(double initial, double percentage) {
        Aritmethic aritmethic = new Aritmethic();
        return initial + aritmethic.getPercentage(initial, percentage);
    }

    public float addPercentage(float initial, float percentage) {
        Aritmethic aritmethic = new Aritmethic();
        return initial + aritmethic.getPercentage(initial, percentage);
    }
}
