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
public class ej06ParoImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("¿Es par o impar?");
        System.out.println("Ingrese un número");
        int num= leer.nextInt();
        esPar(num);
    }
    
    public static void esPar(int num){
        if(num%2==0){
            System.out.println("Es Par");
        }else {
            System.out.println("Es impar");
        }
    }
    
}
