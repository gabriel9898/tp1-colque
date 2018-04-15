/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01.ejercicio5;

/**
 *
 * @author gabriel-not
 */
public class Raizcuadratica {
    public void raice (double a ,double b ,double c){
        double disc = Math.pow(b,2)-4*a*c;
        if (a != 0){
            if (disc<0){
                System.out.println("Tiene raices imaginarias");
            }else{
                double x1=(-b+Math.sqrt(disc))/(2*a);
                double x2=(-b-Math.sqrt(disc))/(2*a);
                System.out.println("X1 = "+x1+"X2 = "+x2);
            }
        }else{
            System.out.println("El coeficiente cuadratico debe ser diferente");
        }
    }
}
