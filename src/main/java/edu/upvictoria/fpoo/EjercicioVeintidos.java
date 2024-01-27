package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Aritmethic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeintidos {
    public EjercicioVeintidos () {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Aritmethic aritmethic = new Aritmethic();

        double kw = 0;
        double price = 0;

        try {
            System.out.println("Give me the amount of kw");
            kw = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the price per kw");
            price = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        System.out.println("The total price is: " + aritmethic.multiply(kw, price));
    }
}
