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
public class ej15CalculadoraFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num1, num2, op;
        double resultado;
        
        System.out.println("Ingrese el 1er número");
        num1= scan.nextInt();
        System.out.println("Ingrese el 2do número");
        num2= scan.nextInt();
        
        System.out.println("Elija el número de la operación");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4.División");
        do{
            op= scan.nextInt();
        }while(op<1||op>4);
        
        switch(op){
            case 1: 
                resultado= Suma(num1, num2);
                System.out.println("El resultado es "+ (int) resultado);
                break;
            case 2: 
                resultado= Resta(num1, num2);
                System.out.println("El resultado es "+ (int) resultado);
                break;
            case 3: 
                resultado= Multiplicacion(num1, num2);
                System.out.println("El resultado es "+ (int) resultado);
                break;
            case 4: 
                resultado= Division(num1, num2);
                System.out.println("El resultado es "+ resultado);
                break;
        }
        
    }
    
    public static int Suma(int n1, int n2){
        return n1+n2;
    }
    
    public static int Resta(int n1, int n2){
        return n1-n2;
    }
    
    public static int Multiplicacion(int n1, int n2){
        return n1*n2;
    }
    
    public static double Division(double n1, double n2){
        return n1/n2;
    }
}
