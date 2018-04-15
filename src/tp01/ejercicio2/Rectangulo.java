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
public class Rectangulo {
    public double area (double base, double altura){
        double resultado = base * altura;
        return resultado ;
    }
    
    public double perimetro (double base, double altura){
        double resultado = 2*( base + altura);
        return resultado ;
    }
}
