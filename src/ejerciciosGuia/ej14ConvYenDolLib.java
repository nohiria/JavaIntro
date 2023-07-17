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
public class ej14ConvYenDolLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
     
        System.out.println("Ingrese el monto en euros");
        double euros= leer.nextDouble();
        String moneda;
        leer.nextLine();
        
        do{
            System.out.println("Ingrese las iniciales de la moneda para la conversión");
            System.out.println("LIB/DOL/YEN");
            moneda= leer.nextLine().toUpperCase();
        }while(!moneda.equals("YEN")&&!moneda.equals("LIB")&&!moneda.equals("DOL"));
        
        conversor(euros, moneda);
    }
    
    public static void conversor(double euros, String moneda){
        if (moneda.equals("YEN")){
            double yen=euros*129852;
            System.out.println(euros+" Euros equivale a "+yen+" Yenes");
        }else if(moneda.equals("DOL")){
            double dol=euros*1.28611;
            System.out.println(euros+" Euros equivale a "+dol+" Dólares");
        }else{
            double lib=euros*0.86;
            System.out.println(euros+" Euros equivale a "+lib+" Libras");
        }
    }
}
