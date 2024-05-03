
// Haga un algoritmo que permita calcular el precio de una compra 
// Donde, por compras superiores a $50.000 se hace un descuento del 10% sobre 
// El valor inicial.

package com.mycompany.pregunta02;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Pregunta02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de $ de la Compra");
        double dinero = scanner.nextDouble();
        
    if (dinero >= 50000) {
        
        double descuento = dinero * 0.10;
        double precioDescuento = dinero - descuento;
        
        System.out.println("Se aplica descuento");
        System.out.println("El precio final de la compra es: $" + precioDescuento);
    }else {
        System.out.println("No se aplica descuento, precio total: $" +dinero);
    }
    }
}