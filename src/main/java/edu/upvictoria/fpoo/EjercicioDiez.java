package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.helpers.Conversions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDiez {
    public EjercicioDiez() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Conversions conversions = new Conversions();
        double meters = 0;

        try {
            System.out.println("Give me the amount of meters: ");
            meters = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        System.out.println("The amount on inches is: " + conversions.metersToInches(meters));
    }
}
