package edu.upvictoria.fpoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        menu.printWelcome();
        menu.selectOpc();
    }
}