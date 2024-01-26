package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioQuince {
    public static double getTotalAmount(double amountPerHour, double hours) {
        return amountPerHour * hours;
    }

    public static void printExerciseInitializer() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        double amountPerHour = 0;
        double hours = 0;

        try {
            System.out.println("Give me the amount per hour: ");
            amountPerHour = Double.parseDouble(scanner.readLine());
            System.out.println("How many hours will you be here?");
            hours = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        System.out.println("The total amount is: " + getTotalAmount(amountPerHour, hours));
    }
}
