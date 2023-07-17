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
public class Ej11FuncionesSecuenciaCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresa la frase a codificar");
        String frase= leer.nextLine();
        System.out.println(cambiarVocales(frase));
        
    }
    
    public static String cambiarVocales(String frase){
        //Se crea un Sting vacío donde concatenar las letras
        String fraseNueva="";
        //Iterando la frase
        for (int i=0; i<frase.length();i++){
            //Revisando las letras
            String letra= frase.substring(i,i+1);
            switch (letra){
                case "a":
                    letra="@";
                break;
                case "e":
                    letra="#";
                break;
                case "i":
                    letra="$";
                break;
                case "o":
                    letra="%";
                break;
                case "u":
                    letra="*";
                break;
            }
            //Concatenando las letras 1 a 1
            fraseNueva=fraseNueva.concat(letra);
        }
        return fraseNueva;
    }
}
