/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01.ejercicio1;

/**
 *
 * @author gabriel-not
 */
public class CalculoImpar {
    public void determinarimpares(int numA){
        System.out.println("los primeros 100 numeros impares apartir de "+numA+" son:");
        for (int i=numA;i<(numA+100);i++){
            if ((i % 2) == 1){
               System.out.println(i); 
            }    
        } 
        
    }

}
