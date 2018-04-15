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
public class Sumatoria {
    public void ValorSumatoria (int numA){
        int sumatorio = 0;
        int contador = numA;
        while (contador != 0){
            sumatorio = sumatorio + (2*(contador-1));
            contador --;
        }
        System.out.println("El sumatorio de (2*(i-1)) es "+sumatorio);
    }
}
