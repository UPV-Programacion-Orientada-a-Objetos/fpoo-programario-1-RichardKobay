package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Aritmethic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeinticinco {
    public EjercicioVeinticinco () {
        Aritmethic aritmethic = new Aritmethic();
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        double hotelExpenses = 0;
        double foodExpenses = 0;
        double otherExpenses = 0;
        double totalOfDays = 0;

        try {
            System.out.println("Give me the hotel expenses:");
            hotelExpenses = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the save food expenses:");
            foodExpenses = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the other expenses (per day):");
            otherExpenses = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the total of days:");
            totalOfDays = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        double total = getTotal(hotelExpenses, foodExpenses, otherExpenses, totalOfDays);

        System.out.println("The time will be: " + total);
    }

    public double getTotal(double hotelExpenses, double foodExpenses, double otherExpenses, double totalOfDays) {
        return hotelExpenses + foodExpenses + (otherExpenses * totalOfDays);
    }
}
