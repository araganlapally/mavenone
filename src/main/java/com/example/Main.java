package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 10; // Default value
        int num2 = 20; // Default value

        if (System.console() != null) { // Check if running in an interactive console
            System.out.print("Enter first number: ");
            num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            num2 = scanner.nextInt();
        } else {
            System.out.println("Running in Jenkins, using default values: " + num1 + " and " + num2);
        }

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}
