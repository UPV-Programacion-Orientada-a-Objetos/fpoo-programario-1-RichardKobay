package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioNueve {
    public static double calculateTotalPayPerHour(double payPerHour, double hoursWorked) {
        return payPerHour * hoursWorked;
    }

    public static void printExerciseInitializer() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        double payPerHour = 0;
        double hoursWorked = 40;

        try {
            System.out.println("How much the worker will be paid for hour?");
            payPerHour = Double.parseDouble(scanner.readLine());
            System.out.println("How many hours worked this week? (Default 8 per day Mon to Fri)");
            hoursWorked = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Calculating with default values...");
        }

        System.out.println("The total to be paid is: " + calculateTotalPayPerHour(payPerHour, hoursWorked));
    }
}
