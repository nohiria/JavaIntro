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
public class ej21RegistroNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        double[] alumnos= new double[10];
        
        cargarNotas(alumnos, scan);
    }
    
    public static void cargarNotas(double[] array, Scanner scan){
        int aprobado=0;
        double notaFinalAlumno;
        double nota;
        
        for(int i=0; i<array.length; i++){ //Iterar 10 alumnos
            System.out.println("Alumno "+(i+1));
            notaFinalAlumno=0;
            for(int j=0; j<4; j++){// Iterar 4 notas
                switch(j){
                    case 0:
                        System.out.println("Ingrese nota de la 1era práctica");
                        nota= validarNotas(scan)*0.1; //Se valida que la nota este entre 0 y 10
                        notaFinalAlumno+=nota;
                        break;
                    case 1:
                        System.out.println("Ingrese nota de la 2da práctica");
                        nota= validarNotas(scan)*0.15;
                        notaFinalAlumno+=nota;
                        break;
                    case 2:
                        System.out.println("Ingrese nota del 1er parcial");
                        nota= validarNotas(scan)*0.25;
                        notaFinalAlumno+=nota;
                        break;
                    case 3:
                        System.out.println("Ingrese nota del 2do parcial");
                        nota= validarNotas(scan)*0.5;
                        notaFinalAlumno+=nota;
                        break;
                } //notaFinalAlumno=nota1*(0.1)+nota2*(0.15)+nota3*(0.25)+nota4*(0.5);
            }
            if(notaFinalAlumno>7){
                System.out.println("Alumno aprobado con "+notaFinalAlumno);
                aprobado++;
            }else{
                System.out.println("Alumno desaprobado con "+notaFinalAlumno);
            }
        }
        //Imprimir resultados
        System.out.println("Alumnos aprobados: "+aprobado);
        System.out.println("Alumnos desaprobados: "+(array.length-aprobado));
    }
    
    public static double validarNotas(Scanner scan){
        double num= scan.nextDouble();
        while(num<0||num>10){
            System.out.println("Nota inválida, ingrese un número del 0 al 10");
            num= scan.nextDouble();
        }
        return num;
    }
    
}
