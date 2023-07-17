/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class Ej08WhileNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese una nota válida");
        int nota= leer.nextInt();
        
        while(nota<0 || nota>10){
            System.out.println("Ingrese una nota válida");
            nota= leer.nextInt();
        }
    }
    
}
