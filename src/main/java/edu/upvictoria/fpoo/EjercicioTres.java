package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioTres {

    /**
     * Get the area of a rectangle
     * @param b base of the rectangle
     * @param h height of the rectangle
     * @return area of a rectangle
     * */
    public static double getRectangleArea(double b, double h) {
        if (b < 0 || h < 0) {
            System.out.println("One or more of the numbers are negative, we changed its value for its abs val.");
            b = Math.abs(b);
            h = Math.abs(h);
        }
        return Math.floor((b * h) * 100) / 100;
    }

    public static void printExerciseInitializer() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        double base = 0;
        double height = 0;

        try {
            System.out.println("Give me the base");
            base = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the height");
            height = Double.parseDouble(scanner.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("The input was not what we excepted");
            return;
        }

        System.out.println("The rectangle area is: " + getRectangleArea(base, height));
    }
}
