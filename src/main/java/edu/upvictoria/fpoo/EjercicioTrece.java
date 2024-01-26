package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class EjercicioTrece {

    public static double fromPesosToDollars( double pesos) {
        return pesos * 0.058;
    }

    public static void printExerciseInitializer() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        double amountInPesos = 0;

        try {
            System.out.println("Give me the amount in pesos (current change 0.058 dollars per peso)");
            amountInPesos = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        System.out.println("The amount in dollars is: " + fromPesosToDollars(amountInPesos));
    }
}
