package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioUno {
    /**
    * Sum two numbers
    * @param a first number
    * @param b second number
    * @return the sum of a + b
    * */
    public static double sum(double a, double b){return a + b;}

    /**
     * Main function
     * Ask the user the two numbers and prints its sum (works with decimal an integer numbers)
     * */
    public static void printExerciseInitializer() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

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

        double sum = sum(n1, n2);

        if (Math.floor(sum) == Math.ceil(sum))
            System.out.println(Math.round(sum));
        else
            System.out.println(sum);
    }
}
