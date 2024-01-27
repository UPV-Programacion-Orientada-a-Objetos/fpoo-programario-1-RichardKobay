package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Aritmethic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioQuince {

    public EjercicioQuince() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Aritmethic aritmethic = new Aritmethic();

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

        System.out.println("The total amount is: " + aritmethic.multiply(amountPerHour, (int) Math.ceil(hours / 100)));
    }
}
