/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class Ej06CondicionalesIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        //Pedir números
        System.out.println("Ingrese el 1er número");
        int num1= leer.nextInt();
        System.out.println("Ingrese el 2do número");
        int num2= leer.nextInt();
        
        //¿Son mayores que 25?
        if (num1>25 && num2>25){
            System.out.println("Los dos números son mayores que 25");
        }else if(num1>25 || num2>25){
            System.out.println("Sólo uno de los números es mayor que 25");
            if(num1>25){
                System.out.println("Es el número 1");
            }else{
                System.out.println("Es el número 2");
            }
        }else{
            System.out.println("Ninguno de los número es mayor que 25");
        }
    }
    
}
