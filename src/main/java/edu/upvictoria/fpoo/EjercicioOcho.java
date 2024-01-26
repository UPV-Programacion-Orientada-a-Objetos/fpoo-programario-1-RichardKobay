package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioOcho {

    public static double getDistance (double x1, double x2, double y1, double y2) {
        return Math.sqrt(((x2 * x2) - (x1 * x1)) + ((y1 * y1) - (y2 * y2)));
    }

    public static void printExerciseInitializer() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;

        try {
            System.out.println("Give me the x value of the point one: ");
            x1 = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the y value of the point one: ");
            y1 = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the x value of the second point: ");
            x2 = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the y value of the second point: ");
            y2 = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        System.out.println("The distance of the two points is: " + getDistance(x1, x2, y1, y2));
    }
}
