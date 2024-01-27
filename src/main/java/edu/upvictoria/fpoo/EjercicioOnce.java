package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.helpers.Conagua;
import edu.upvictoria.fpoo.math.Geometry;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioOnce {

    public EjercicioOnce() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Conagua conagua = new Conagua();

        double length = 0;
        double height = 0;
        double width = 0;
        double waterPrice = 0;

        try {
            System.out.println("Give me the length of the pool (m)");
            length = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the height (m)");
            height = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the width (m)");
            width = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the price per cubic meter of water");
            waterPrice = Double.parseDouble(scanner.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("The input was not what we excepted");
        }

        System.out.println("The total price is: " + conagua.getPoolPrice(waterPrice, height, width, length));
    }
}
