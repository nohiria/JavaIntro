/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicosExtra;

import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ej05clasesDeSocios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        char socio;
        int tratamiento;
        
        //Pedir datos al usuario
        System.out.println("Ingrese el costo del tratamiento");
        tratamiento= scan.nextInt();
        System.out.println("Ingrese la clase de socio para aplicar el descuento");
        socio=Character.toUpperCase(scan.next().charAt(0));
        
        while(socio!='A'&&socio!='B'&&socio!='C'){
            System.out.println("Clase inválida, intente de nuevo");
            socio=Character.toUpperCase(scan.next().charAt(0));
        }
        
        aplicarDescuento(tratamiento, socio);
    }
    
    public static void aplicarDescuento(int tratamiento, char socio){
        double descuento=0;
        
        switch(socio){
            case 'A':
                descuento=50;
                break;
            case 'B':
                descuento=30;
                break;
        }
        
        System.out.println("Ud es un socio clase "+socio);
        System.out.println("Su descuento es del "+(int)descuento+"%");
        descuento= descuento/100;
        tratamiento-=(tratamiento*descuento);
        System.out.println("Monto a pagar: "+tratamiento);
    }
}
