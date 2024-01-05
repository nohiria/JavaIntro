/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraExercises;

import java.util.Scanner;

/**
 * A Java program to convert a number to Roman Numerals.
 */
public class Ex04RomanNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Enter a number to convert to Roman numerals: ");
        int num= scan.nextInt();
        
        System.out.println("The number "+num+" is equivalent to "+convertToRoman(num)+" in Roman numerals.");
    }
    
    /**
     * Converts the given number to Roman numerals.
     *
     * @param num The number to be converted.
     * @return A string representing the Roman numeral equivalent.
     */
    public static String convertToRoman(int num){
        // Create an array of Roman numerals and their values based on decomposition.
        String[] rom={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        StringBuilder result= new StringBuilder();
        
        // Iterate throught the array of Roman numerals
        for (int i=0; i<rom.length; i++){
            //While the number is greater than or equal to the value, append the Roman numeral to the result string
            while(num>=values[i]){
                result.append(rom[i]);
                //Substract the value from the number to continue iterating
                num-=values[i];
            }
        }
        return result.toString();
    }
}
