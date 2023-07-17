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
public class ej14PromedioFamilias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int hijosTotal=0;
        int hijos;
        
        System.out.println("Ingrese la cantidad de familias a promediar");
        int familias= scan.nextInt();
        
        for (int i=1; i<=familias; i++){
            System.out.println("Familia "+i);
            System.out.println("Ingrese cantidad de hijos");
            hijos= scan.nextInt();
            hijosTotal+=hijos;
        }
        
        System.out.println("El promedio de hijos de las "+familias+" familias es de "+ hijosTotal/familias);
    }
    
}
