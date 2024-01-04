/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraExercises;

import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ej10AdivinarMultiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num1=(int)(Math.random()*11);
        int num2=(int)(Math.random()*11);
        
        System.out.println("Adivine el resultado de la multiplicación de los números secretos");
        int resultado= scan.nextInt();
        
        if(num1*num2!=resultado){
            System.out.println("Incorrecto! Tienes 1 intento más");
            resultado= scan.nextInt();
        }
        
        if(resultado!=num1*num2){
            System.out.println("Fallaste, el resultado de "+num1+"x"+num2+"="+num1*num2);
        }else {
            System.out.println("Acertaste! "+num1+"x"+num2+"="+num1*num2);
        }
        
    }
    
}
