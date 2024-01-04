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
public class ej03esVocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        char letra;
        
        //Pedir caracter al usuario
        System.out.println("Ingrese una letra"); 
        letra= scan.next().charAt(0);
        
        esVocal(letra);
    }
    
    public static void esVocal(char letra){
        letra= Character.toLowerCase(letra);
        boolean esVocal=letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u';
        
        if(esVocal){
            System.out.println("Es una vocal");
        }else{
            System.out.println("No es vocal");
        }

    }
    
}
