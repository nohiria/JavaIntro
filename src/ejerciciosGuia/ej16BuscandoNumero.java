/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia;

import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ej16BuscandoNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Ingrese el número de enteros");
        int enteros= scan.nextInt();
        int[] vector= new int[enteros];
        int cont=0;
        
        for (int i=0; i<enteros; i++){
            vector[i]= (int)(Math.random()*50+1);
        }
        
        System.out.println("Ingrese el número a buscar");
        int num= scan.nextInt();
        
        for (int i=0; i<enteros; i++){
            if (vector[i]==num){
                cont++;
                System.out.println("Número encontrado en la posición ["+i+"]");
            }
        }
        if (cont==0){
            System.out.println("Número no encontrado");
        }else{
            System.out.println("Número encontrado "+cont+" veces");
        }
    }
    
}
