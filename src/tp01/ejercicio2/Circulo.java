/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01.ejercicio2;

/**
 *
 * @author gabriel-not
 */
public class Circulo {
    public double area (double radio){
        double resultado = Math.PI * Math.pow(radio,2); 
        return  resultado;
    }
    
    public double perimetro (double radio){
        double resultado = 2*Math.PI*radio;
        return resultado ;
    }
}
