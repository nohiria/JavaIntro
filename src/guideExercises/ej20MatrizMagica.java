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
public class ej20MatrizMagica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[][] matriz= new int[3][3];
        
        //Pedir elementos de la matriz al usuario
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Ingrese m["+i+"]["+j+"]");
                matriz[i][j]=scan.nextInt();
            }
        }
        
        if(!comprobarElementos(matriz)){
            System.out.println("Los números de la matriz deben estar entre 1 y 9");
        }else if(filas(matriz)&&columnas(matriz)&&diagonal1(matriz)&&diagonal2(matriz)){
            System.out.println("Es Mágica");
        }else{
            System.out.println("No es mágica");
        }
    }
    
    //COMPROBAR SI LOS ELEMENTOS DE LA MATRIZ ESTÁN ENTRE 1 Y 9
    public static boolean comprobarElementos(int[][] m) {
        boolean bandera=true;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(m[i][j]<1||m[i][j]>9){
                    bandera=false;
                }
            }
        }
        return bandera;
    }
    
    //OBTENER VALOR MODELO
    public static int valorModelo(int[][] m){
        int valor=0;
        for(int i=0; i<3; i++){
            valor=valor+m[1][i];
        }
        return valor;
    }
    
    //SUMAR FILAS
    public static boolean filas(int[][] m){
        int suma;
        boolean esMagica= true;
        
        for(int i=0; i<3; i++){
            suma=0;
            for(int j=0; j<3; j++){
                suma=suma+m[i][j];
            }
            if (suma!=valorModelo(m)){
                esMagica=false;
            }
        }
        return esMagica;
    }    
    
    //SUMAR COLUMNAS
    public static boolean columnas(int[][] m){
        int suma;
        boolean esMagica= true;
        
        for(int i=0; i<3; i++){
            suma=0;
            for(int j=0; j<3; j++){
                suma=suma+m[j][i];
            }
            if (suma!=valorModelo(m)){
                esMagica=false;
            }
        }
        return esMagica;
    } 
    
    //SUMAR DIAGONAL1
    public static boolean diagonal1(int[][] m){
        int suma=0;
        boolean esMagica= true;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j){
                 suma=suma+m[i][j];   
                } 
            }
        }
        if (suma!=valorModelo(m)){
                esMagica=false;
            }
        return esMagica;
    } 
    
    //SUMAR DIAGONAL2
    public static boolean diagonal2(int[][] m){
        int suma=0;
        int j=0;
        boolean esMagica=true;
        
        for(int i=2; i>=0; i--){
            suma=suma+m[i][j];
            j++;
        }
        if (suma!=valorModelo(m)){
            esMagica=false;
        }
        return esMagica;
    } 
}
