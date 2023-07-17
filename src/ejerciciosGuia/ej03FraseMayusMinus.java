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
public class ej03FraseMayusMinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        //Pedir frase al usuario
        System.out.println("Ingresa una frase");
        String frase= leer.nextLine();
        
        //Frase Mayus
        System.out.println("Frase en mayúsculas: "+frase.toUpperCase());
        //Frase Minus
        System.out.println("Frase en minúsculas: "+frase.toLowerCase());
    }
    
}
