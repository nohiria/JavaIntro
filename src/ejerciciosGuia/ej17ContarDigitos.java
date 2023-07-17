/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia;

import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ej17ContarDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n;
        do{
           System.out.println("Ingresa N");
           n= scan.nextInt();
        }while(n<0||n>99999);
        
        n++;
        int[] array= new int[n];
        int num;
        int dig1=0, dig2=0, dig3=0, dig4=0, dig5=0;
        
        for (int i=0; i<n; i++){
            array[i]=i;
        }
        
        for (int i=0; i<n; i++){
            
            if(array[i]==0){
                array[i]++;
            }
            
            num= (int)Math.floor(Math.log10(Math.abs(array[i]))+1);
            
            switch(num){
                case 1:
                    dig1++;
                    break;
                case 2:
                    dig2++;
                    break;
                case 3:
                    dig3++;
                    break;
                case 4:
                    dig4++;
                    break;
                case 5:
                    dig5++;
                    break;
            }
        }
        n--;
        System.out.println("De 0 a "+n+" hay:");
            System.out.println(dig1+" números de 1 dígito");
            System.out.println(dig2+" números de 2 dígitos");
            System.out.println(dig3+" números de 3 dígitos");
            System.out.println(dig4+" números de 4 dígitos");
            System.out.println(dig5+" números de 5 dígitos");
    }
    
}
