/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraExercises;

import java.util.Scanner;

/**
 * A simple Java program to check if a given letter is a vowel.
 */
public class Ex03isAVowel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char letter;

        //Prompt user to enter a character
        System.out.println("Ingrese una letra");
        letter = scan.next().charAt(0);

        //Call the method to check if the entered character is a vowel
        isVowel(letter);
    }

    /**
     * Check if the given character is a vowel and display the result.
     *
     * @param letter The character to be checked.
     */
    public static void isVowel(char letter) {
        //Convert the character to lowercase for case-insensitive comparison
        letter = Character.toLowerCase(letter);

        //Check if the character is a vowel
        String vowels = "aeiou";
        boolean isVowel = vowels.indexOf(letter) != -1;

        //Display the result
        if (isVowel) {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is not a vowel");
        }
    }

}
