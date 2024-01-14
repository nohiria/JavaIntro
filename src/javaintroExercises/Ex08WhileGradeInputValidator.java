/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroExercises;

import java.util.Scanner;

/**
 * A program to demonstrate the use of a while loop to ensure the input of a
 * valid grade. It prompts the user to input a grade and continues prompting
 * until a valid grade (between 0 and 10) is provided.
 */
public class Ex08WhileGradeInputValidator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for input of a valid grade
        System.out.println("Enter a valid grade");
        int grade = scan.nextInt();

        while (grade < 0 || grade > 10) {
            System.out.println("Enter a valid grade");
            grade = scan.nextInt();
        }
    }

}
