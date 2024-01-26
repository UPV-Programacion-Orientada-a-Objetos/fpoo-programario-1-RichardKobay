package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCuatro {

    public static double getCircleArea(double r) {
        return Math.floor((Math.PI * (r*r)) * 100) / 100;
    }

    public static void printExerciseInitializer() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        double circleArea = 0;

        System.out.println("Give me the circle radius");
        try {
            circleArea = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The number specified is not what is excepted");
        }

        circleArea = getCircleArea(circleArea);

        System.out.println("The area of the circle is: " + circleArea);
    }
}
