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
public class ej10NumLimiteSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese el número límite");
        int limite= leer.nextInt();
        int suma=0;
        int num;
        
        do{
            System.out.println("Ingrese un número a sumar");
            num= leer.nextInt();
            suma=suma+num;
        }while(suma<=limite);
        
        System.out.println("La suma superó el límite");
        System.out.println("Límite: "+ limite);
        System.out.println("Suma Final: "+ suma);
        
    }
    
}
