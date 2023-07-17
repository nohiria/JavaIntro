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
public class ej13EscaleraDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num;
        int cont=0;
        
        System.out.println("Ingrese el tamaño de la escalera");
        num= scan.nextInt();
        
        for(int i=0; i<num; i++){ //Iterar filas
            cont++; //Contador para columnas
            for(int j=0; j<cont; j++){ //iterar columnas según contador
               System.out.print((j+1)+" "); 
            }
            System.out.println("");
        }
    }
    
}
