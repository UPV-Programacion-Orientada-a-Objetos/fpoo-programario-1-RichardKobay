package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Aritmethic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDos {

    public void printExerciseInitializer()  {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Aritmethic aritmethic = new Aritmethic();
        int length = 0;

        System.out.println("Enter the number of scores to save");
        try {
            length = Integer.parseInt(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
            return;
        }

        double[] scores = new double[length];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter the score " + i + 1);
            try {
                scores[i] = Double.parseDouble(scanner.readLine());
            } catch (IOException | NumberFormatException e) {
                System.out.println("The number specified is not what is excepted");
                if (i >= 1) i--;
            }

            if (scores[i] < 0) {
                System.out.println("You cannot enter a negative number");
                i--;
            }
        }

        System.out.println("The average is: " + aritmethic.getAgerage(scores));
    }
}
