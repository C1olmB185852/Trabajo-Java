/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pregunta01;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Pregunta01 {

    public static void main(String[] args) {
        Scanner pago = new Scanner(System.in);
        System.out.print("Ingrese el sueldo base del empleado: $");
        double sueldoBase = pago.nextDouble();

        final double INCREMENTO = 0.3;
        double incremento = sueldoBase * INCREMENTO;
        double sueldoFinal = sueldoBase + incremento;

        System.out.println("El sueldo final del empleado es: $" + sueldoFinal);
    }
  }