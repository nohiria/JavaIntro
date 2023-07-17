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
public class ej04ConvertCentAFah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en centígrados:");
        double c= leer.nextDouble();
        double f= 32+(9*c/5);
        System.out.println(c+"°C="+f+"°F");
    }
    
}
