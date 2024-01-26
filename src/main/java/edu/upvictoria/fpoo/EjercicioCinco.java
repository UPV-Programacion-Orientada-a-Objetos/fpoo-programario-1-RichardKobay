package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCinco {
    public static double getTriangleArea (double b, double h) {
        return (b * h) / 2;
    }

    public static double getFullArea (double a, double b, double c) {
        double area;
        area = EjercicioTres.getRectangleArea(b, c);
        area = area + getTriangleArea(b, a - c);
        return area;
    }

    public static void printExerciseInitializer() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double b = 0;
        double c = 0;


        try {
            System.out.println("Give me A");
            a = Double.parseDouble(scanner.readLine());
            System.out.println("Give me B");
            b = Double.parseDouble(scanner.readLine());
            System.out.println("Give me C");
            c = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("One of the numbers are not what we excepted");
        }

        System.out.println("The area is: " + getFullArea(a, b, c));
    }
}
