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
public class ej24Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("¿Cuántos números de la secuencia desea mostrar?");
        int n=scan.nextInt();
        
        fibonacci(n);
    }
    
    public static void fibonacci(int n){
        int a=1;
        int b=1;
        int aux;
        for(int i=0; i<n; i++){
            System.out.print(a+", ");
            
            aux=a+b;
            a=b;
            b=aux;
        }
        System.out.println("...");
    }
}
