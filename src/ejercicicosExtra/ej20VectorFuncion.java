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
public class ej20VectorFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("¿De qué tamaño es el vector?");
        int[] vector= new int[scan.nextInt()];
        
        rellenarVector(vector);
        imprimirVector(vector);
    }
    
    public static void rellenarVector(int[] vector){
        for(int i=0; i<vector.length; i++){
            vector[i]= (int)(Math.random()*100+1);
        }
    }
    
    public static void imprimirVector(int[] vector){
        for(int i=0; i<vector.length; i++){
            System.out.print(vector[i]+" ");
        }
    }
}
