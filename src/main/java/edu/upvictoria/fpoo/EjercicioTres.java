package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioTres {
    public EjercicioTres() {
        Geometry geometry = new Geometry();
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

        System.out.println("The rectangle area is: " + geometry.getRectangleArea(base, height));
    }
}
