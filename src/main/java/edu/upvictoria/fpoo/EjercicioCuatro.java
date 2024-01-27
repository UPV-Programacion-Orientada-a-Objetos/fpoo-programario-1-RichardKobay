package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCuatro {
    public static void printExerciseInitializer() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Geometry geometry = new Geometry();
        double circleArea = 0;

        System.out.println("Give me the circle radius");
        try {
            circleArea = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The number specified is not what is excepted");
        }

        circleArea = geometry.getCircleArea(circleArea);

        System.out.println("The area of the circle is: " + circleArea);
    }
}
