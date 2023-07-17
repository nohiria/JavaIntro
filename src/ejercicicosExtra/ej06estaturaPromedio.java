/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicosExtra;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ej06estaturaPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("#.00");
        
        double altura;
        double promedioBajos=0;
        double promedioGeneral=0;
        double contBajos=0;
        double contGeneral=0;
        
        //Pedir datos al usuario
        System.out.println("¿Cuántas personas serán medidas?");
        int[] vector= new int[scan.nextInt()];
        
        //Recorrer elementos del vector
        for (int i=0; i<vector.length; i++){
            System.out.println("Ingrese la altura de la persona n°"+(i+1));
            altura= scan.nextDouble();
            //Promedio Bajos
            if(altura<1.60){
               promedioBajos+=altura;
               contBajos++;
            }
            //Promedio General
            promedioGeneral+=altura;
            contGeneral++;
        }
        
        //Operadore ternario en caso de 0/0
        System.out.println("El promedio de altura de las personas bajas ingresadas es de "+ (contBajos !=0 ? df.format(promedioBajos/contBajos): "0"));
        System.out.println("El promedio de altura general es de "+ df.format(promedioGeneral/contGeneral));
    }
    
}
