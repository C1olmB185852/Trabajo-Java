/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionalesdobles;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class CondicionalesDobles {

// 1. Haga un algoritmo que solicite el ingreso de un número e indique si es 
// positivo o negativo

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("El número no es positivo");
        } else {
            System.out.println("El número es positivo");
    }
        
// 2. Algoritmo que solicite la edad de una persona, si la edad es menor a 18 
// indique es la persona es menor de edad, de lo contrario indique que es mayor 
// de edad
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad:"));
        if (edad < 18) {
        JOptionPane.showMessageDialog(null, "Eres menor de edad.");
        }
	else{
       JOptionPane.showMessageDialog(null, "Eres mayor de edad.");
				}
    }
    
// 5. Algoritmo que permita verificar si un número es par o impar y mostrar un 
//mensaje correspondiente
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número es par.");
        } else {
            JOptionPane.showMessageDialog(null, "El número es impar.");
        }
    }

    
