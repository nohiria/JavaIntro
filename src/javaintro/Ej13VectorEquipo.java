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
public class Ej13VectorEquipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        String[] equipo= new String[6];
        
        System.out.println("Escribe los nombres de los jugadores");
        for (int i=0; i<6; i++){
            equipo[i]=leer.nextLine();
        }
        
        System.out.println("El equipo está formado por");
        for (int i=0; i<6; i++){
            System.out.println("-"+equipo[i]);
        }
    }
    
}
