/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01.ejercicio4;

/**
 *
 * @author gabriel
 */
public class Productoria {
     public void ValorProductoria (int numA){
        int productoria = 1;
        int contador = numA;
        while (contador != 0){
            productoria = productoria * contador;
            contador --;
        }
        System.out.println("El productoria de "+ numA+" es "+productoria);
    }
}
