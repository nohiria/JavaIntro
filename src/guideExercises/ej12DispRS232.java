/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guideExercises;

import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ej12DispRS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int lecCorrecta=0;
        int lecIncorrecta=0;
        String cadena;
        
        do{
           System.out.println("Ingrese la cadena");
           cadena= leer.nextLine(); 
           while(cadena.length()!=5){
               System.out.println("La longitud de la cadena debe ser de 5 caracteres");
               cadena= leer.nextLine();
           }
           if (cadena.substring(0,1).equals("X")&&cadena.substring(4).equals("O")){
               lecCorrecta++;
           }else if(!cadena.equals("&&&&&")){
               lecIncorrecta++;
           }
        }while(!cadena.equals("&&&&&"));
        
        System.out.println("Lecturas Correctas: "+lecCorrecta);
        System.out.println("Lecturas Incorrectas: "+lecIncorrecta);
    }
    
}
