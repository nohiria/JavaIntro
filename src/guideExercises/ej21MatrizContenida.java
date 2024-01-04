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
public class ej21MatrizContenida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[][] matriz10= new int[10][10];
        int[][] matriz3= new int[3][3];
        
        //ASIGNAR MATRICES
        asignarMatriz(matriz10);
        asignarMatriz(matriz3);
        
        //IMPRIMIR MATRICES
        imprimirMatriz(matriz10);
        System.out.println("********************");
        imprimirMatriz(matriz3);
        
        //Ver si está contenida
        matrizContenida(matriz10, matriz3);
    }
    
    //ASIGNAR MATRICES
    public static void asignarMatriz(int[][] m){
        int fil= m.length;
        int col= m[0].length;
        
        for(int i=0; i<fil; i++){
            for(int j=0; j<col; j++){
                m[i][j]=(int)(Math.random() * 2 + 1);
            }
        }
    }
    
    //IMPRIMIR MATRICES
    public static void imprimirMatriz(int[][] m){
        int fil= m.length;
        int col= m[0].length;
        
        for(int i=0; i<fil; i++){
            for(int j=0; j<col; j++){
                System.out.print(" "+m[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    //COMPROBAR MATRICES
    public static void matrizContenida(int[][] m1, int[][] m2){
        int fil1= m1.length;
        int col1= m1[0].length;
        int fil2= m2.length;
        int col2= m2[0].length;
        int in=-1;
        int jn=-1;
        boolean bandera= false;
        
        for(int i=0; i<fil1-fil2+1; i++){
            for(int j=0; j<col1-col2+1; j++){
                if(m1[i][j]==m2[0][0]){
                    bandera=true;
                    in=i;
                    jn=j;
                    
                    for(int k=0; k<fil2; k++){
                        for(int l=0; l<col2; l++){
                            if(m1[in+k][jn+l]!=m2[k][l]){
                                bandera=false;
                                break;
                            }
                        }
                        if(!bandera){
                            break;
                        }
                    }
                }
                if(bandera){
                    break;
                }
            }
            if(bandera){
                break;
            }
        }
        
        if(!bandera){
            System.out.println("Matriz no contenida");
        }else{
            System.out.println("Matriz contenida, inicio en el índice ["+in+"]["+jn+"]");
        }
    }
}
