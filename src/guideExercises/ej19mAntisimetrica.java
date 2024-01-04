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
public class ej19mAntisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        int[][] matriz= new int[3][3];
        int[][] traspuesta= new int[3][3];
        
        //Asignar matriz
        
        for (int i=0; i<3; i++){
            for (int j=0; j<3;j++){
                System.out.println("Ingrese m["+i+"]["+j+"]");
                matriz[i][j]= scan.nextInt();
            }
        }
        //Asignar traspuesta
        for (int i=0; i<3; i++){
            for (int j=0; j<3;j++){
                traspuesta[i][j]=matriz[j][i];
            }
        }
        //Imprimir matriz
        System.out.println("Matriz");
        imprimirMatriz(matriz);
        //Imprimir traspuesta
        System.out.println("Traspuesta");
        imprimirMatriz(traspuesta);
        //Comparar matrices
        esAsimetrica(matriz, traspuesta);
    }
    
    public static void imprimirMatriz(int[][] matriz){
        for (int i=0; i<3; i++){
            for (int j=0; j<3;j++){
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void esAsimetrica(int[][] m1, int[][] m2){
        boolean asimetrica=true;
        
        for (int i=0; i<3; i++){
            for (int j=0; j<3;j++){
                //Si los valores absolutos de las matrices son diferentes entre sí
                if((Math.abs(m1[i][j])!=Math.abs(m2[i][j]))&&(m1[i][j]==0)){
                    asimetrica=false;
                }else if(m1[i][j]<0&&m2[i][j]<0){ //Si ambos son menores que 0
                    asimetrica=false;
                }else if(m1[i][j]>0&&m2[i][j]>0){ //Si ambos son mayores que 0
                    asimetrica=false;
                }
            }
        }
        
        System.out.println("Es asimétrica?");
        System.out.println(asimetrica);
    }
}
