/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicosExtra;

import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ej18sumarValoresVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        //Pedir datos al usuario
        System.out.println("Ingrese el tamaño del vector");
        int[] vector= new int[scan.nextInt()];
        
        llenarVector(vector, scan);
        imprimirVector(vector);
        sumarVector(vector);
    }
    
    public static void llenarVector(int[] vector, Scanner scan) {
        for(int i=0; i<vector.length; i++){
            System.out.println("Ingrese el valor de ["+i+"]");
            vector[i]= scan.nextInt();            
        }
    }
    
    public static void imprimirVector(int[] vector) {
        for(int i=0; i<vector.length; i++){
            System.out.print(vector[i]+", ");            
        }
    }
    
    public static void sumarVector(int[] vector) {
        int suma=0;
        for(int i=0; i<vector.length; i++){
            suma+=vector[i];           
        }
        System.out.println("La suma de los elementos del vector es igual a "+suma);
    }
    
}
