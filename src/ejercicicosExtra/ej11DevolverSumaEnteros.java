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
public class ej11DevolverSumaEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num;
        int aux;
        int cant=0;
        
        System.out.println("Ingrese un número");
        num= scan.nextInt();
        aux= num;
        
        if (num==0){
            cant++;
        }else{
           while(num>0){
            num/=10;
            cant++;
        } 
        }
        
        
        
        System.out.println(aux+" tiene "+cant+" digitos");
    }
    
}
