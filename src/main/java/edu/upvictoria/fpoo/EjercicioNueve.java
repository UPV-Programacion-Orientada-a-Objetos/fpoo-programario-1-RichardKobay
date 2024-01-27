package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.helpers.Payments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioNueve {

    public EjercicioNueve() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Payments payments = new Payments();

        double payPerHour = 0;
        double hoursWorked = 40;
        int weeks = 0;

        try {
            System.out.println("How much the worker will be paid for hour?");
            payPerHour = Double.parseDouble(scanner.readLine());
            System.out.println("How many hours works per day?");
            hoursWorked = Double.parseDouble(scanner.readLine());
            System.out.println("How many weeks do you wanna calculate? (only Integers)");
            hoursWorked = Double.parseDouble(scanner.readLine());
            weeks = Integer.parseInt(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Calculating with default values...");
        }

        System.out.println("The total to be paid is: " + payments.totalPayInXWeeks(payPerHour, hoursWorked, weeks));
    }
}
