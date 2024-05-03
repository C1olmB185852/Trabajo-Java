/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionalessimples;
import javax.swing.JOptionPane;


import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class CondicionalesSimples {
    
// 1. Haga un algoritmo que solicite e indique si es positivo
// de lo contrario no indique nada

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();			
        if (num > 0) {
        System.out.println("El número es positivo");
        }
        
// 2. Algoritmo que solicite la edad de una persona, si la edad es menor a 18 
// indique es la persona es menor de edad

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad:"));
        if (edad < 18) {
        JOptionPane.showMessageDialog(null, "Eres menor de edad.");
        }

    }
}
