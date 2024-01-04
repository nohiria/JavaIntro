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
public class ej23SopaLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] sopaLetras= new String[20][20];
        String[] palabras= new String[5];
        obtenerPalabras(palabras);
        ordenarPalabras(sopaLetras, palabras);
        rellenarMatriz(sopaLetras);
        imprimirMatriz(sopaLetras);
    }
            
    public static void obtenerPalabras(String[] vector){
        Scanner scan= new Scanner(System.in);
        
        //Se piden 5 palabras al usuario, se valida que tengan de 3 a 5 letras
        for(int i=0; i<vector.length; i++){
            System.out.println("Ingrese la palabra "+(i+1));
            vector[i]= scan.nextLine();
            while(vector[i].length()<3&&vector[i].length()>5){
                System.out.println("Palabra inválida. Debe tener de 3 a 5 letras");
                vector[i]=scan.nextLine();
            }
        }
    }
    
    public static void ordenarPalabras(String[][] matriz, String[] palabra){
        int fila, columna;
        //Se iteran las palabras
        for(int i=0; i<palabra.length; i++){
            fila=(int) (Math.random()*20); //Se genera la fila aleatoria
            columna=(int) (Math.random()*20-palabra[i].length()); //Columna aleatoria
            for(int j=0; j<palabra[i].length(); j++){ //Se asignan las letras iterando las columnas
                matriz[fila][columna+j]=palabra[i].substring(j,j+1);
            }
        }
    }
    
    public static void rellenarMatriz(String[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                if(matriz[i][j]==null){ //Si la posición está vacía se le asigna un número aleatorio
                   matriz[i][j]= String.valueOf((int)(Math.random()*10)); 
                }
            }
        }
    }
    
    public static void imprimirMatriz(String[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
