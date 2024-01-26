package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Aritmethic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDieciocho {
    public EjercicioDieciocho () {
        Aritmethic aritmethic = new Aritmethic();
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        double price = 0;
        double km = 0;

        try {
            System.out.println("Give me the amount of km: ");
            km = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the cost of each km: ");
            price = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        System.out.println("The total price is: MXN$" + aritmethic.multiply(km, price));
    }
}
