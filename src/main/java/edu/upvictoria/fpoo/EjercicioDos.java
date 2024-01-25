package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class EjercicioDos {

    public static double getAgerage(double[] scores, int length) {
        double average = 0;
        for(double score : scores)
            average += score;

        average = average / length;

        return Math.floor(average * 100) / 100;
    }

    public static void printExerciseInitializer()  {
        int length = 0;
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

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
                i--;
            }

            if (scores[i] < 0) {
                System.out.println("You cannot enter a negative number");
                i--;
            }
        }

        System.out.println("The average is: " + getAgerage(scores, length));
    }
}
