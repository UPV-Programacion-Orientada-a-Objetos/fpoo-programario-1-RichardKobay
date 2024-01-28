package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Geometry;
import edu.upvictoria.fpoo.math.Trigonometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCinco {
    public EjercicioCinco (boolean test) {}

    public EjercicioCinco () {
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
    public double getFullArea (double a, double b, double c) {
        Geometry geometry = new Geometry();
        Trigonometry trigonometry = new Trigonometry();
        double area;
        area = trigonometry.getTriangleArea(b, a - c);
        area = area + geometry.getRectangleArea(b, c);
        return area;
    }
}
