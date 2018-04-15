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
public class Tp02 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        Circulo circulo = new Circulo();
        double ResultadoRA = rectangulo.area(2, 3);
        double ResultadoRP = rectangulo.perimetro(5, 3);
        
        double ResultadoCA = circulo.area(9.5);
        double ResultadoCP = circulo.perimetro(4.8);
        
        System.out.println("Area Rectangulo: "+ResultadoRA);   
        System.out.println("Perimetro Rectangulo: "+ResultadoRP); 
        
        System.out.println("Area Circulo: "+ResultadoCA); 
        System.out.println("Perimetro Circulo: "+ResultadoCP);
    }
 
}
