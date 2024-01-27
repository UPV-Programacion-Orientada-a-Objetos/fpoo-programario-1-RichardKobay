package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.math.Aritmethic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeinticuatro {
    public EjercicioVeinticuatro () {
        Aritmethic aritmethic = new Aritmethic();
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        double salary = 0;
        double percentage = 0;
        double time = 0;

        try {
            System.out.println("Give me the salary:");
            salary = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the save percentage:");
            percentage = Double.parseDouble(scanner.readLine());
            System.out.println("Give me the time:");
            time = Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
        }

        double total = (aritmethic.getPercentage(salary, percentage)) * time;

        System.out.println("The time will be: " + total);
    }
}
