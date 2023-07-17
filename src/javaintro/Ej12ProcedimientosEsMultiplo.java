/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class Ej12ProcedimientosEsMultiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        //Pedir números al usuario
        System.out.println("Ingrese un número");
        int num1= leer.nextInt();
        System.out.println("Ingrese el 2do número");
        int num2= leer.nextInt();
        
        //Procedimiento
        esMultiplo(num1,num2);
    }
    
    public static void esMultiplo(int num1, int num2){
        if (num1%num2==0){
            System.out.println("El "+num1+" SÍ es múltiplo de "+num2);
        }else {
            System.out.println("El "+num1+" NO es múltiplo de "+num2);
        }
    }
    
}
