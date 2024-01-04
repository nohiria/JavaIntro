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
public class ej08ContarCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Introduzca una frase/palabra de 8 car");
        String frase= leer.nextLine();
        
        if (frase.length()!=8){
            System.out.println("INCORRECTO");
        } else{
            System.out.println("CORRECTO");
        }
    }
    
}
