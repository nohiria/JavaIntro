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
public class ej16nombreYedad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String respuesta;
        int cont=1;
        
        do{
            System.out.println("Persona "+cont);
            System.out.println("Ingrese el nombre");
            String nombre= scan.nextLine();
            System.out.println("Ingrese la edad");
            int edad= scan.nextInt();
            
            System.out.println(nombre);
            System.out.println(edad);
            if(edad>=18){
                System.out.println("Es mayor de edad");
            }else{
                System.out.println("Es menor de edad");
            }
            scan.nextLine();
            do{
                System.out.println("¿Desea continuar? Si/No");
                respuesta= scan.nextLine();
                if(!respuesta.equalsIgnoreCase("Si")&&!respuesta.equalsIgnoreCase("No")){
                    System.out.println("Ingrese una respuesta válida");
                }
            }while(!respuesta.equalsIgnoreCase("Si")&&!respuesta.equalsIgnoreCase("No"));
            
            cont++;
        }while(!respuesta.equalsIgnoreCase("No"));
        
        System.out.println("Programa finalizado!");
    }
    
}
