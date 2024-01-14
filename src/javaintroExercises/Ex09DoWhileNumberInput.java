/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroExercises;

import java.util.Scanner;

/**
 * A java program to demonstrate the use of a do-while loop to read and process
 * numbers from the user. It prompts the user to input numbers until 20 numbers
 * are entered or until a zero is entered, whichever comes first. It calculates
 * and prints the sum of the entered numbers.
 * 
 * The loop includes an condition to terminate if the user enters zero.
 */
public class Ex09DoWhileNumberInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int sum = 0;

        do {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            sum += num;

            // Check if the entered number is zero to terminate the loop
            if (num == 0) {
                System.out.println("Loop terminated");
                break;
            }

            i++;
        } while (i < 20);

        System.out.println("The sum of the entered numbers is " + sum);
    }
}
