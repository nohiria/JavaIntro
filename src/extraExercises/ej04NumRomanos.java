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
public class ej04NumRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Ingrese un número para convertir a romanos");
        int num= scan.nextInt();
        
        System.out.println("El número "+num+" es igual a "+convertirRomanos(num)+" en números romanos");
    }
    
    public static String convertirRomanos(int num){
        // Se crea una cadena de números romanos y sus valores basados en la descomposición
        String[] rom={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        StringBuilder resultado= new StringBuilder();
        
        //Se crea un ciclo para iterar el array de números romanos
        for (int i=0; i<rom.length; i++){
            //Mientras el número sea mayor que el valor se escribe en la cadena de resultado
            while(num>=valores[i]){
                resultado.append(rom[i]);
                //Se resta al número el valor para seguir iterando
                num-=valores[i];
            }
        }
        return resultado.toString();
    }
}
