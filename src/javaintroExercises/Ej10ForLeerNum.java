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
public class Ej10ForLeerNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        int[] numeros= new int[4];
        
        //Leer números
        for (int i=0; i<4; i++){
            System.out.println("Ingrese un número entre 1 y 20");
            numeros[i]=leer.nextInt();
            
            while(numeros[i]<1 || numeros[i]>20){
                System.out.println("El número es inválido");
                System.out.println("Ingrese un número entre 1 y 20");
                numeros[i]=leer.nextInt();
            }
        }
        
        //Imprimir números
        for (int i=0; i<4; i++){
            System.out.print(numeros[i]+" ");
            for (int j=0; j<numeros[i]; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
