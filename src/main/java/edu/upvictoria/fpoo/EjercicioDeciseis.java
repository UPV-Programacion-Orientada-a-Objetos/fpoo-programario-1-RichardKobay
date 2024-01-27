package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Aritmethic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDeciseis {
    public static void printExerciseInitializer() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Aritmethic aritmethic = new Aritmethic();
        double m2 = 0;
        double paintPrice = 0;

        try {
            System.out.println("Give me the amount of paint in m^2");
            m2 = Double.parseDouble(scanner.readLine());
            System.out.println("How much does the paint cost?");
            paintPrice = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        System.out.println("The total price is: " + aritmethic.multiply(m2, paintPrice));
    }
}
