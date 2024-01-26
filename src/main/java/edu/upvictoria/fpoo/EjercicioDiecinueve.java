package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Aritmethic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDiecinueve {
    public EjercicioDiecinueve () {
        Aritmethic aritmethic = new Aritmethic();
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        double velocity = 0;
        double distance = 0;

        try {
            System.out.println("Give me the distance (km):");
            distance = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the velocity (km/h):");
            velocity = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        System.out.println("The time will be: " + aritmethic.multiply(distance, velocity));
    }
}
