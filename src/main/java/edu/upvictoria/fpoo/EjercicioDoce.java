package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Geometry;
import edu.upvictoria.fpoo.math.Trigonometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;

public class EjercicioDoce {
    public EjercicioDoce() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Trigonometry trigonometry = new Trigonometry();

        double base = 0;
        double height = 0;

        try {
            System.out.println("Give me the base");
            base = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the height");
            height = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        System.out.println("The area of the triangle is: " + trigonometry.getTriangleArea(base, height));
    }
}
