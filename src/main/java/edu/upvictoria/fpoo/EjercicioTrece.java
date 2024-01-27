package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.helpers.Conversions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioTrece {

    public EjercicioTrece() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Conversions conversions = new Conversions();
        double amountInPesos = 0;

        try {
            System.out.println("Give me the amount in pesos (current change 0.058 dollars per peso)");
            amountInPesos = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        System.out.println("The amount in dollars is: " + conversions.pesosToDollars(amountInPesos));
        System.out.println("Price checked ene 25 2024");
    }
}
