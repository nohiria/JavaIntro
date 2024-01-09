/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroExercises;

/**
 * A java program demonstrating the use of Arithmetic, Unary and Relational
 * Operators.
 */
public class Ex03Operators {

    public static void main(String[] args) {
        //Variables declaration
        int num1 = 2;
        int num2 = 3;

        //Arithmetic Operator
        int sum = num1 + num2;

        //Unary Operator
        sum++;

        //Relational Operator
        boolean flag = num1 < num2;

        //Display results
        System.out.println("Sum: " + sum);
        System.out.println("Flag (num1<num2): " + flag);
    }
}
