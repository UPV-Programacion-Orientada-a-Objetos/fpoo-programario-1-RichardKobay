package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.helpers.Conagua;
import edu.upvictoria.fpoo.math.Aritmethic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeintuno {
    public EjercicioVeintuno () {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Conagua conagua = new Conagua();

        double m3 = 0;
        double price = 0;

        try {
            System.out.println("Give me the amount of m3");
            m3 = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the price per m3");
            price = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        System.out.println("The total price is: " + conagua.getTotalPerCubicMeter(m3, price));
    }
}
