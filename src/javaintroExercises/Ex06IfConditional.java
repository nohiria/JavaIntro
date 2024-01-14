/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroExercises;

import java.util.Scanner;

/**
 * A java program to demonstrate the use of conditional statements (if-else).
 * It prompts the user to input to numbers ande then checks whether both are 
 * greater than 25, if only one is greater than 25, or if neither is greater than
 * 25. It prints different messages based in these conditions.
 */
public class Ex06IfConditional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for input of two numbers
        System.out.println("Enter the 1st number:");
        int num1 = scan.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = scan.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Both numbers are greater than 25");
        } else if (num1 > 25 || num2 > 25) {
            System.out.println("Only one of the numbers is greater than 25");
            if (num1 > 25) {
                System.out.println("It is the 1st number");
            } else {
                System.out.println("It is the 2nd number");
            }
        } else {
            System.out.println("Neither of the numbers is greater than 25");
        }
    }
    
}
