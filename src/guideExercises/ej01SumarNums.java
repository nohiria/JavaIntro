/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guideExercises;

import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ej01SumarNums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese el 1er número");
        int num1= leer.nextInt();
        System.out.println("Ingrese el 2do número");
        int num2= leer.nextInt();
        suma(num1,num2);
        
    }
    
    public static void suma(int num1, int num2){
        int suma=num1+num2;
        System.out.println(num1+"+"+num2+"="+suma);
    }
}
