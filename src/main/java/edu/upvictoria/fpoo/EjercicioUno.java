package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Aritmethic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioUno {

    /**
     * Main function
     * Ask the user the two numbers and prints its sum (works with decimal an integer numbers)
     * */
    public void EjercicioUno() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Aritmethic aritmethic = new Aritmethic();

        double n1 = 0;
        double n2 = 0;

        try {
            System.out.println("Please give me the first number");
            n1 = Double.parseDouble(scanner.readLine());
            System.out.println("Now, give me the second number");
            n2 = Double.parseDouble(scanner.readLine());
        } catch (IOException e) {
            System.out.println("The input numbers are not valid");
        }

        double sum = aritmethic.sum(n1, n2);

        if (Math.floor(sum) == Math.ceil(sum))
            System.out.println(Math.round(sum));
        else
            System.out.println(sum);
    }
}
