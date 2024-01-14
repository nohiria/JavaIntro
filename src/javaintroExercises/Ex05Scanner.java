/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroExercises;

import java.util.Scanner;

/**
 * A java program to demonstrate the usage of the Scanner class to read and input
 * from the user, specifically capturing and name and an age. It then prints a 
 * welcome message using the providen information.
 */
public class Ex05Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a Scanner object for input
        Scanner scan= new Scanner(System.in);
        
        // Prompt user for name input
        System.out.println("Enter your name");
        String name= scan.nextLine();
        
        // Prompt user for age input
        System.out.println("Enter your age");
        int age= scan.nextInt();
        
        // Print welcome message
        System.out.println("Welcome "+name+"! You're "+age+" years old.");
       
    }
    
}
