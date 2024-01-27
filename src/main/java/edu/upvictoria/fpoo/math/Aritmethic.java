package edu.upvictoria.fpoo.math;

import org.jetbrains.annotations.NotNull;

public class Aritmethic {
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double multiply(double a, int b) {
        return a * b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public float sum(float a, float b) {
        return a + b;
    }

    public double sum(double a, double b, double c) {
        return a + b + c;
    }

    public double sum(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    public double sum(double a, double b, double c, double d, double e) {
        return a + b + c + d + e;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public float divide(float a, float b) {
        return a / b;
    }

    public int getPercentage(int a, int b) {
        return (a * 100) / b;
    }

    public double getPercentage(double a, double b) {
        return (a * 100) / b;
    }

    public float getPercentage(float a, float b) {
        return (a * 100) / b;
    }


    public double getAgerage(double @NotNull [] scores) {
        double average = 0;
        for (double score : scores)
            average += score;

        average = average / scores.length;

        return Math.floor(average * 100) / 100;
    }

    public int getAgerage(int @NotNull [] scores) {
        double average = 0;
        for (double score : scores)
            average += score;

        average = average / scores.length;

        return (int) (Math.floor(average * 100) / 100);
    }
}
