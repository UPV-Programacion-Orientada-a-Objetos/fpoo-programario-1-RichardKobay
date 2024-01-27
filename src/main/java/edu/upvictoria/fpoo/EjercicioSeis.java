package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Geometry;
import edu.upvictoria.fpoo.math.Trigonometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSeis {

    public EjercicioSeis() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        double h = 0;
        double r = 0;

        try {
            System.out.println("Give me H");
            h = Double.parseDouble(scanner.readLine());
            System.out.println("Give me R");
            r = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        System.out.println("The area of the shape is: " + calculateArea(h, r));
    }

    public double calculateArea (double h, double r) {
        Trigonometry trigonometry = new Trigonometry();
        Geometry geometry = new Geometry();
        double area;
        area = trigonometry.getTriangleArea(r, h) * 2;
        area = area + geometry.getCircleArea(r) / 2;
        return area;
    }
}
