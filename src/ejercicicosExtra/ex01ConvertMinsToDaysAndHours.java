/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicosExtra;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to convert a given time in minutes to days and hours. For example,
 * if the user enters 1600 minutes, the system should calculate its equivalent:
 * 1 day, 2 hours.
 */
public class ex01ConvertMinsToDaysAndHours {

    /**
     * The main method that interacts with the user and calls the conversion
     * method.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            //Ask the user the input minutes
            double min = getValidMinutesFromUser(scan);

            displayConvertedTime(min);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            // Close the Scanner to avoid resource leaks
            scan.close();
        }
    }

    public static double getValidMinutesFromUser(Scanner scan) {
        double min = -1;

        while (min < 0) {
            try {
                System.out.println("Enter the number of minutes (non-negative): ");
                min = scan.nextDouble();

                if (min < 0) {
                    System.out.println("Please enter a non-negative number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scan.next(); // Clear the input buffer
            }
        }

        return min;
    }

    /**
     * Converts the given time in minutes to days and hours and displays the
     * result.
     *
     * @param min The time in minutes to be converted.
     */
    public static void displayConvertedTime(double min) {
        double totalHours = min / 60;
        double days = Math.floor(totalHours / 24);
        double remainingHours = totalHours % 24;

        //Display the result
        System.out.println("Result:");
        System.out.print(min + " minutes is approximately ");

        //Displays days with correct grammar
        if (days > 1 || days == 0) {
            System.out.print((int) days + " days and ");
        } else {
            System.out.print((int) days + " day and ");
        }

        //Display hours with correct grammar
        if (remainingHours > 1 || remainingHours == 0) {
            System.out.println((int) remainingHours + " hours");
        } else {
            System.out.println((int) remainingHours + " hour");
        }
    }
}
