package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.helpers.Prices;
import edu.upvictoria.fpoo.math.Aritmethic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeintitres {
    public EjercicioVeintitres () {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Prices prices = new Prices();

        double price = 0;
        double discount = 0;

        try {
            System.out.println("Give me the initial price");
            price = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the discount");
            discount = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        double total = prices.removePercentage(price, discount);
        total = prices.addPercentage(total, 15);

        System.out.println("The total price is: " + total);
    }
}
