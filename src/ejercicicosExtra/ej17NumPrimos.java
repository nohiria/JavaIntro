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
public class ej17NumPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num= scan.nextInt();
        
        System.out.println(num+((esPrimo(num))?" sí ":" no ")+"es primo");
    }
    
    public static boolean esPrimo(int num){
        int cont=0;
        
        for(int i=2; i<num; i++){
            if(num%i==0){
                cont++;
            }
        }
        
        return cont==0;
    }
}
