/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroExercises;

import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class Ej09doWhileLeerNums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        int i=0;
        int suma=0;
        
        do {
            System.out.println("Ingrese un número");
            int num=leer.nextInt();
            suma=suma+num;
            if (num==0){
                System.out.println("Ciclo terminado");
                break;
            }
            i++;
        }while(i<20);
        
        System.out.println("La suma de los números ingresados es "+ suma);
            
        
    }
    
}
