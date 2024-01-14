/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroExercises;

import java.util.Scanner;

/**
 * A program to demonstrate the use of a switch statement in Java. It prompts
 * the user to input a motor number and uses a switch statement to determine and
 * print the type of motor based on the provided number.
 *
 * The program recognizes motors with numbers 1, 2, 3, and 4, and provides
 * corresponding messages. If the input is not within this range, it prints a
 * default message.
 */
public class Ex07MotorTypeSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        // Prompt user for input of motor number
        System.out.println("Enter the motor number:");
        int motorType= scan.nextInt();
        
        // Switch statement to determine and print the type of motor
        switch(motorType){
            case 1: 
                System.out.println("The motor is a water pump");
            break;
            case 2: 
                System.out.println("The motor is a gasoline pump");
            break;
            case 3:
                System.out.println("The motor is a concrete pump");
            break;
            case 4:
                System.out.println("The motor is a food paste pump");
            break;
            default:
                System.out.println("No valid value for motor type");
        }
    }
}
