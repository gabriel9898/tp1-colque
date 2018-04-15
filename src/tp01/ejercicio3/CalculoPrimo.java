/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01.ejercicio3;

/**
 *
 * @author gabriel-not
 */
public class CalculoPrimo {
    public void determinarNumerosPrimos(int numA, int numB){
        for (int i=numA;i<(numB+1);i++){
            determinarPrimo(i);    
        }  
    }
    public void determinarPrimo(int numA){
        int aux = 0;
        for (int i=1;i<(numA+1);i++){
            if (numA%i == 0){
                aux++;
            }    
        }
        if (aux == 2){
            System.out.println("Es primo el numero "+numA);
        }
        
    }
}
        
            

