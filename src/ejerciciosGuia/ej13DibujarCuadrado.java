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
public class ej13DibujarCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del lado");
        int num= leer.nextInt();
        
        for (int fila=0; fila<num; fila++){
            for(int col=0; col<num;col++){
                if(fila==0||fila==num-1||col==0||col==num-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
        
    }
    
}
