package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;

public class EjercicioCatorce {

    public static int getAge(int currentYear, int birthYear) {
        return currentYear - birthYear;
    }

    public static void printExerciseInitializer() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int year = 0;

        try {
            System.out.println("Give me your birth year");
            year = Integer.parseInt(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input is not valid");
        }

        System.out.println("Your age is " + getAge(Year.now().getValue(), year));
    }

}
