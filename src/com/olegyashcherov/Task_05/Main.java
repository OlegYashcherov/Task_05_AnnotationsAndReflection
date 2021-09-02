package com.olegyashcherov.Task_05;

import com.olegyashcherov.Task_01.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CachingCalculatorProxy();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String request;
            System.out.println("For close this app write \"exit\".");
            System.out.print("Write value for calculated: ");
            while (true) {
                if (reader.ready()) {
                    while (!(request = reader.readLine()).equals("exit")) {
                        System.out.println("Answer is: " + calculator.calc(Integer.parseInt(request)));

                        System.out.println("For close this app write \"exit\".");
                        System.out.print("Write value for calculated: ");
                    }
                    System.out.println("Goodbye!");
                    break;
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
