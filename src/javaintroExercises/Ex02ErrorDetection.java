/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroExercises;

/**
 * A Java program demonstrating error detection and correction in variable declarations.
 */
public class Ex02ErrorDetection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Code with errors:
        /* 
          string name
          bolean flag
          char char;
        */
        
        //Corrected code:
        String name; //Added semicolon at the end
        boolean flag; //Changed "bolean" to "boolean"
        char character; //Avoid using a reserved keyword "char" as a variable name
    }
}
