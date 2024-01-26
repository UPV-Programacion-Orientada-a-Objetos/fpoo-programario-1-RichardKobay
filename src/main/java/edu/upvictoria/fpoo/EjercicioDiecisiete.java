package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDiecisiete {

    public double getHypotenuse(double a, double b) {
        return Math.sqrt((a * a) + (b * b));
    }

    public EjercicioDiecisiete() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double b = 0;

        try {
            System.out.println("Give me a");
            a = Double.parseDouble(scanner.readLine());
            System.out.println("Give me b");
            b = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e ) {
            System.out.println("The input was not what we excepted");
        }

        System.out.println("The length of the hypotenuse is: " + getHypotenuse(a, b));
    }
}
