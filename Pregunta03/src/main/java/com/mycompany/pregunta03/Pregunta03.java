
// Haga un algoritmo que imprima cual es el mayor de 2 números.

package com.mycompany.pregunta03;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Pregunta03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el Primer numero");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Ingrese el Segundo numero");
        double numero2 = scanner.nextDouble();
        
        if (numero1 > numero2) {
            System.out.println("El primero numero " + numero1 + " Es mayor que el segundo numero " + numero2 );
        } else if (numero2 > numero1) {
            System.out.println("El segundo numero " + numero2 + " Es mayor que el primer número " + numero1);
        } else {
            System.out.println("Ambos números son iguales " + numero1 + " = " + numero2 );
    }
    }
}
