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
public class ej02IntercambiaVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int A,B,C,D,aux;
        
        System.out.println("Ingrese la variable A");
        A= scan.nextInt();
        System.out.println("Ingrese la variable B");
        B= scan.nextInt();
        System.out.println("Ingrese la variable C");
        C= scan.nextInt();
        System.out.println("Ingrese la variable D");
        D= scan.nextInt();
        System.out.println("A="+A+"; B="+B+"; C="+C+"; D="+D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("A="+A+"; B="+B+"; C="+C+"; D="+D);
    }
}
