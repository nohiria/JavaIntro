/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroExercises;

import java.util.Scanner;

/**
 * A program to demonstrate the use of a for loop in Java to read, validate, and
 * process an array of numbers. It prompts the user to input four number between
 * 1 and 20. It then prints the entered numbers and a corresponding number of
 * asteriks for each.
 *
 * The program ensures that each entered number is within the valid range.
 */
public class Ex10ForNumberArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[4];

        // Read and validate numbers
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a number between 1 and 20");
            numbers[i] = scan.nextInt();

            // Validate the input range
            while (numbers[i] < 1 || numbers[i] > 20) {
                System.out.println("The number is invalid");
                System.out.println("Enter a number between 1 and 20");
                numbers[i] = scan.nextInt();
            }
        }

        // Print numbers and corresponding asteriks
        for (int i = 0; i < 4; i++) {
            System.out.print(numbers[i] + " ");
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
