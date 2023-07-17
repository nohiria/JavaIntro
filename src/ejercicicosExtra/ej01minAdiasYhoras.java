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
public class ej01minAdiasYhoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        //Pedir minutos al usuario
        System.out.println("Ingrese los minutos a convertir");
        double min= scan.nextInt();
        
        convertirMin(min);
    }
    
    public static void convertirMin(double min){
        int h= (int)(min/60);
        int dia= h/24;
        h=h%24;
        
        System.out.println((int)min+" minutos equivale a "+dia+" días y "+h+" horas");
        
    }
    
}
