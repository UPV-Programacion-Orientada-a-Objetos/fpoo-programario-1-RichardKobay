package edu.upvictoria.fpoo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu.printWelcome();
        while (true) {
            int opc = 0;
            Menu.printMenu();
            try {
                opc = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println();
                System.out.println("----------------------------------");
                System.out.println("---------OPCIÓN NO VÁLIDA---------");
                System.out.println("--------INTÉNTALO DE NUEVO--------");
                System.out.println("----------------------------------");
                System.out.println();
                System.out.println();
                scanner.nextLine();
            }

            if (opc >= 1 && opc <= 26) {
                if (opc == 1) EjercicioUno.printExerciseInitializer();
                if (opc == 2) EjercicioDos.printExerciseInitializer();
                if (opc == 3) EjercicioTres.printExerciseInitializer();
                if (opc == 4) EjercicioCuatro.printExerciseInitializer();
                if (opc == 5) System.out.println("Option 5");
                if (opc == 6) System.out.println("Option 6");
                if (opc == 7) System.out.println("Option 7");
                if (opc == 8) System.out.println("Option 8");
                if (opc == 9) System.out.println("Option 9");
                if (opc == 10) System.out.println("Option 10");
                if (opc == 11) System.out.println("Option 11");
                if (opc == 12) System.out.println("Option 12");
                if (opc == 13) System.out.println("Option 13");
                if (opc == 14) System.out.println("Option 14");
                if (opc == 15) System.out.println("Option 15");
                if (opc == 16) System.out.println("Option 16");
                if (opc == 17) System.out.println("Option 17");
                if (opc == 18) System.out.println("Option 18");
                if (opc == 19) System.out.println("Option 19");
                if (opc == 20) System.out.println("Option 20");
                if (opc == 21) System.out.println("Option 21");
                if (opc == 22) System.out.println("Option 22");
                if (opc == 23) System.out.println("Option 23");
                if (opc == 24) System.out.println("Option 24");
                if (opc == 25) System.out.println("Option 25");
                if (opc == 25) System.out.println("Option 26");
            }
        }
    }
}