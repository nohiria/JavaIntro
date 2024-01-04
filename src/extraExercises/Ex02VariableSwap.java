/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraExercises;

import java.util.Scanner;

/**
 * A simple Java program to swap values of four variables (A, B, C, D).
 */
public class Ex02VariableSwap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B, C, D, aux;

        //Prompt user to enter values for A, B, C, D
        System.out.println("VALUES SWAPPING");
        System.out.println("_____________________");
        System.out.println("Enter the value of A");
        A = scan.nextInt();
        System.out.println("Enter the value of B");
        B = scan.nextInt();
        System.out.println("Enter the value of C");
        C = scan.nextInt();
        System.out.println("Enter the value of D");
        D = scan.nextInt();

        //Display initial values
        System.out.println("Initial values: ");
        System.out.println("A=" + A + "; B=" + B + "; C=" + C + "; D=" + D);

        //Swap values
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        //Display final values
        System.out.println("Final values after swaps: ");
        System.out.println("A=" + A + "; B=" + B + "; C=" + C + "; D=" + D);

        //Close scanner to avoid resource leaks
        scan.close();
    }
}
