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
public class Ej05Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear objeto de clase Scanner
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        String nombre= leer.nextLine();
        
        System.out.println("Ingresa tu edad");
        int edad= leer.nextInt();
        
        System.out.println("Bienvenida "+nombre+", tienes "+edad+" años");
       
    }
    
}
