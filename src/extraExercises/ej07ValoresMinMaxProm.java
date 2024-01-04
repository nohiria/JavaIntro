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
public class ej07ValoresMinMaxProm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        //Pedir n al usuario
        System.out.println("¿Cuántos números deseas ingresar?");
        int n= scan.nextInt();
        
        //usingDo(n, scan);
        usingWhileDo(n, scan);
    }
    
    public static void usingDo(int n, Scanner scan){
        int numMax=0;
        int numMin=0;
        int cont=0;
        int num;
        double promedio=0;
        
        do{
            System.out.println("Ingrese un número");
            num= scan.nextInt();
            if (numMin==0){
                numMax=num;
                numMin=num;
            }else if (num>numMax){
                numMax= num;
            }else if(num<numMin){
                numMin=num;
            }
            cont++;
            promedio+=num;
        }while (cont<n);
   
        System.out.println("El número Máximo es "+ numMax);
        System.out.println("El número Mínimo es "+ numMin);
        System.out.println("El promedio de los números es "+promedio/cont);
    }
    
    public static void usingWhileDo(int n, Scanner scan){
        int numMax=0;
        int numMin=0;
        int cont=0;
        int num;
        double promedio=0;
        
        while(n>cont){
            System.out.println("Ingrese un número");
            num= scan.nextInt();
            if (numMin==0){
                numMax=num;
                numMin=num;
            }else if (num>numMax){
                numMax= num;
            }else if(num<numMin){
                numMin=num;
            }
            cont++;
            promedio+=num;
        }
   
        System.out.println("El número Máximo es "+ numMax);
        System.out.println("El número Mínimo es "+ numMin);
        System.out.println("El promedio de los números es "+promedio/cont);
    }
}
