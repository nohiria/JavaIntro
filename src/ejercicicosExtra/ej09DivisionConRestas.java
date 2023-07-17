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
public class ej09DivisionConRestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int divisor=0;
        int dividendo=0;
        
        //DIVISOR
        do{
            System.out.println("Ingrese el divisor");
            divisor= scan.nextInt();
        }while(divisor<=0);
        
        //DIVIDENDO
        do{
            System.out.println("Ingrese el dividendo");
            dividendo= scan.nextInt();   
        }while(dividendo<=0);
        
        dividirConRestasSucesivas(divisor, dividendo);
    }
    
    //DIVISIÓN DE NÚMEROS POSITIVOS 
    public static void dividirConRestasSucesivas(int divisor, int dividendo){
        int cociente=0;
        
        while(divisor>=dividendo){
            cociente++;
            System.out.println(divisor+"+"+dividendo+"="+(divisor-dividendo)+"    "+cociente+" restas realizadas");
            divisor-=dividendo;
        }
        
        System.out.println("El residuo es "+divisor+" y el cociente es "+cociente);
    }
}
