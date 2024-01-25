package edu.upvictoria.fpoo;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me the first number");
        String n1 = scanner.nextLine();
        System.out.println("Now, give me the second number");
        String n2 = scanner.nextLine();

        double n2Double = 0;
        double n1Double = 0;

        try {
            n1Double = Double.parseDouble(n1);
            n2Double = Double.parseDouble(n2);
        } catch (NumberFormatException e) {
            System.out.println("The input numbers are not valid");
        }

        double sum = sum(n1Double, n2Double);

        if (Math.floor(sum) == Math.ceil(sum))
            System.out.println(Math.round(sum));
        else
            System.out.println(sum);
    }
}
