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
public class ej11MenuCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("1er número");
        int num1= leer.nextInt();
        System.out.println("2do número");
        int num2= leer.nextInt();
        int opcion;
        String salir="N";
        
        do{
            do{
                mostrarMenu();
                opcion=leer.nextInt();
                if (opcion<1||opcion>5){
                    System.out.println("Ingrese una opción válida");
                }
            }while(opcion<1||opcion>5);

            leer.nextLine();
            
            switch (opcion){
            case 1:
                System.out.println(num1+"+"+num2+"="+(num1+num2));
                break;
            case 2:
                System.out.println(num1+"-"+num2+"="+(num1-num2));
                break;
            case 3:
                System.out.println(num1+"x"+num2+"="+(num1*num2));
                break;
            case 4:
                System.out.println(num1+"/"+num2+"="+(num1/num2));
                break;
            case 5:
                do{
                    System.out.println("¿Está seguro de que desea salir del programa?");
                    salir= leer.nextLine().toUpperCase();
                }while(!salir.equals("N")&&!salir.equals("S"));
                break;
            }
        }while(!salir.equals("S"));
        
        System.out.println("Hasta luego!");
        
        
    }
    
    public static void mostrarMenu(){
        System.out.println("MENÚ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5.Salir");
    }
}