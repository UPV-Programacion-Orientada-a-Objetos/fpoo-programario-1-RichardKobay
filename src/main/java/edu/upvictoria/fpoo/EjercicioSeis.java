package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSeis {

    public static void printExerciseInitializer() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        double h = 0;
        double r = 0;
        double area;


        try {
            System.out.println("Give me H");
            h = Double.parseDouble(scanner.readLine());
            System.out.println("Give me R");
            r = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        area = EjercicioCinco.getTriangleArea(r, h);
        area = area + EjercicioCuatro.getCircleArea(r);

        System.out.println("The area of the shape is: " + area);
    }
}
