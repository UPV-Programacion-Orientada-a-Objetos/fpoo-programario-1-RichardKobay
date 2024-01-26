package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSiete {
    public static double getLiterQuantity(double gal) {
        return gal * 3.785;
    }

    public static void printExerciseInitializer() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        double gal = 0;

        System.out.println("Give me the gal ");

        try {
            gal = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        System.out.println("The quantity of gals in liters is: " + getLiterQuantity(gal));
    }
}
