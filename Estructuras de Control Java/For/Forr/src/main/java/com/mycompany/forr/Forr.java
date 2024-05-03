/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forr;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Forr {

    public static void main(String[] args) {

// 1. Cree un algoritmo que lea n cantidad de números y determine si son 
// divisible entre 3.

    int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las veces que quiere repetir: "));
    for (int i = 0; i < cant; i++) {
      int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero:"));
      if (num % 3 == 0) {
        JOptionPane.showMessageDialog(null, "Es divisible");
      } else {
        JOptionPane.showMessageDialog(null, "No es divisible");
      }
    }
    
// 2 . Haga un algoritmo que permita calcular el promedio de n estudiantes, el 
// sistema debe imprimir:
// 1. Cantidad de estudiantes procesados
// 2. Promedio total de los promedios

 int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces a repetir!"));
    for (int i = 0; i < cant; i++) {
      int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero 1: "));
      int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero 2: "));
      int suma = x + y;
      JOptionPane.showMessageDialog(null, "La suma es " + suma);

      if (suma >= 10) {
        JOptionPane.showMessageDialog(null, "La suma es mayor o igual a dos digitos y es positivo!");
      } else if (suma <= 0) {
        JOptionPane.showMessageDialog(null, "La suma arrojó un valor negativo");
        if (suma <= -10) {
          JOptionPane.showMessageDialog(null, "La suma es mayor o igual a dos digitos y es Negativo!");
        } else {
          JOptionPane.showMessageDialog(null, "La suma arroja un valor de un digito");
        }
      } else {
        JOptionPane.showMessageDialog(null, "La suma arroja un valor de un digito y es positivo!");
      }
    }
    
    
// 3. Haga un algoritmo que solicite n números e indique si son positivos o 
// negativos, también debe indicar si tiene uno o más de 2 dígitos

int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces a repetir!"));
    for (int i = 0; i < cant; i++) {
      int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero 1: "));
      int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero 2: "));
      int suma = x + y;
      JOptionPane.showMessageDialog(null, "La suma es " + suma);

      if (suma >= 10) {
        JOptionPane.showMessageDialog(null, "La suma es mayor o igual a dos digitos y es positivo!");
      } else if (suma <= 0) {
        JOptionPane.showMessageDialog(null, "La suma arrojó un valor negativo");
        if (suma <= -10) {
          JOptionPane.showMessageDialog(null, "La suma es mayor o igual a dos digitos y es Negativo!");
        } else {
          JOptionPane.showMessageDialog(null, "La suma arroja un valor de un digito");
        }
      } else {
        JOptionPane.showMessageDialog(null, "La suma arroja un valor de un digito y es positivo!");
      }
    }

    }
}
