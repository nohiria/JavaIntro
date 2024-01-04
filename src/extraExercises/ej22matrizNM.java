/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraExercises;

import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ej22matrizNM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int fil, col;
        
        //Pedir datos al usuario
        System.out.println("Ingrese el número de filas");
        fil= scan.nextInt();
        System.out.println("Ingrese el número de columnas");
        col= scan.nextInt();
        
        int[][] matriz= new int[fil][col];
        
        llenarMatriz(matriz);
        imprimirMatriz(matriz);
    }
    
    public static void llenarMatriz(int[][] matriz){
        for(int i=0;i<matriz.length; i++){
            for(int j=0;j<matriz[0].length; j++){
                matriz[i][j]=(int) (Math.random()*50+1);
            }
        }
    }
    
    public static void imprimirMatriz(int[][] matriz){
        for(int i=0;i<matriz.length; i++){
            for(int j=0;j<matriz[0].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
