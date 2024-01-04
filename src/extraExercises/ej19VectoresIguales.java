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
public class ej19VectoresIguales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n;
        
        System.out.println("Ingrese el tamaño de los vectores");
        n= scan.nextInt();
        
        int[] v1= new int[n];
        int[] v2= new int[n];
        
        llenarVector(v1, scan);
        llenarVector(v2, scan);
        imprimirVector(v1);
        imprimirVector(v2);
        
        sonIguales(v1, v2);
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
        System.out.println("");
    }
    
    public static void sonIguales(int[]v1, int[] v2) {
        boolean flag=true;
        
        for(int i=0; i<v1.length; i++){
            if(v1[i]!=v2[i]){ 
                flag=false;
                break;
            }  
        }
        
        if(flag){
            System.out.println("Los vectores son iguales");
        }else{
            System.out.println("Los vectores no son iguales");
        }
    }
}
