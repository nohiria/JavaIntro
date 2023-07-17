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
public class ej08Multiplos5ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num=0;
        int cont=0;
        int par=0;
        int impar=0;
        
        do{
            do{
              System.out.println("Ingrese un número");
              num= scan.nextInt();  
            }while(num<=0); //El número ingresado por el usuario sólo se cuenta si es mayor que 0
          
            if (num%5==0){ //Si es multiplo de 5 se detiene la lectura
                break;
            }else if(num%2==0){
                par++;
            }else{
                impar++;
            }
            cont++;
        }while(num%5!=0);
        
        System.out.println("Números válidos ingresados: "+cont);
        System.out.println("Números pares: "+par);
        System.out.println("Números impares: "+impar);
        
    }
    
}
