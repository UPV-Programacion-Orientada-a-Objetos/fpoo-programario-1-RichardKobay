package edu.upvictoria.fpoo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioDos {

    public static double getAgerage(double[] scores, int length) {
        double average = 0;
        for(double score : scores)
            average += score;

        average = average / 4;

        return average;
    }

    public static void printExerciseInitializer() {
        int length = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of scores to save");
        try {
            length = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("The input was not what we excepted");
        }

        double[] scores = new double[length];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter the score " + i + 1);
            try {
                scores[i] = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("The number specified is not what is excepted");
                i--;
            }
        }

        System.out.println("The average is: " + getAgerage(scores, length));
    }
}
