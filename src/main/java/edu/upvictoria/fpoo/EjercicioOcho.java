package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.GeometricPlane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioOcho {
    public EjercicioOcho() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        GeometricPlane geometricPlane = new GeometricPlane();

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

        System.out.println("The distance of the two points is: " + geometricPlane.getDistanceBetweenTwoPoints(x1, x2, y1, y2));
    }
}
