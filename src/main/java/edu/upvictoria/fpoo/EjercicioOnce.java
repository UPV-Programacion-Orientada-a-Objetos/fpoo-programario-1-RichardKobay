package edu.upvictoria.fpoo;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioOnce {

    public static double getRectangularPrismVol(double height, double width, double length) {
        return height * width * length;
    }

    public static void printExerciseInitializer() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        double length = 0;
        double height = 0;
        double width = 0;
        double waterPrice = 0;

        try {
            System.out.println("Give me the length of the pool");
            length = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the height");
            height = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the width");
            width = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the price per squared meter of water");
            waterPrice = Double.parseDouble(scanner.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("The input was not what we excepted");
        }

        double totalPrice = waterPrice * getRectangularPrismVol(height, length, width);

        System.out.println("The total price is: " + totalPrice);
    }
}
