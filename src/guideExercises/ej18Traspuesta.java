/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guideExercises;

/**
 *
 * @author nohyv
 */
public class ej18Traspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz= new int[3][3];
        int[][] traspuesta= new int[3][3];
        
        //Asignar matriz
        for (int i=0; i<3; i++){
            for (int j=0; j<3;j++){
                matriz[i][j]= (int)(Math.random() * 9 + 1);
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
        
        
    }
    public static void imprimirMatriz(int[][] matriz){
        for (int i=0; i<3; i++){
            for (int j=0; j<3;j++){
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
