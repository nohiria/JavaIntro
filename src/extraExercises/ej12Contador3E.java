/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraExercises;

/**
 *
 * @author nohyv
 */
public class ej12Contador3E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String col1, col2, col3;
        
        //Iterar 0-0-0
        for (int i = 0; i <= 9; i++) { //Iterar el primer dígito
            for (int j = 0; j <= 9; j++) { //Iterar el segundo dígito
                for (int k = 0; k <= 9; k++) { //Iterar el tercer dígito
                    
                    //Si dígito == 3, se muestra "E", sino muestra el String del iterador
                    if (i==3){
                        col1="E";
                    }else{
                        col1=String.valueOf(i);
                    }
                    
                    if (j==3){
                        col2="E";
                    }else{
                        col2=String.valueOf(j);
                    }
                    
                    if (k==3){
                        col3="E";
                    }else{
                        col3=String.valueOf(k);
                    }
                    //Se imprime la secuencia i-j-k
                    System.out.println(col1 + "-" + col2 + "-" + col3);
                }
            }
        }
    }    
}
