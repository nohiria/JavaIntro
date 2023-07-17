/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ej05DobTriRaizNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("#.00");
        
        System.out.println("Ingrese un número");
        int num= leer.nextInt();
        
        int dob= num*2;
        int tri= num*3;
        double raiz= Math.sqrt(num);
        
        System.out.println("El doble de "+num+" es "+dob);
        System.out.println("El triple de "+num+" es "+tri);
        System.out.println("La raíz cuadrada de "+num+" es "+df.format(raiz));
           
    }
    
}
