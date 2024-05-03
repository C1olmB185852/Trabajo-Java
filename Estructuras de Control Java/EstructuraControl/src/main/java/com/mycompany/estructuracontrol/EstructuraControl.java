
package com.mycompany.estructuracontrol;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class EstructuraControl {
//1. Haga un algoritmo que realice la suma de 2 números e imprima el resultado!
    public static void main(String[] args) {
        int numero1 = 250;
        int numero2 = 598;
        int EstructuraControl = numero1 + numero2;
        System.out.println("La suma es: " + EstructuraControl);
        
// 2. Algoritmo que solicite el nombre y edad de una persona y 3 notas 
// calcule el promedio de ellas
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa la primera nota: ");
        int edad = scanner.nextInt();
        System.out.print("Ingresa su edad "+nombre);
        double nota1 = scanner.nextDouble();
        System.out.print("Ingresa la segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Ingresa la tercera nota: ");
        double nota3 = scanner.nextDouble();
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio de " + nombre + " es: " + promedio);
        
// 3. Calcular el 15% de un valor ingresado por un usuario
        
      double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un valor:"));
      double porcentaje = valor * 0.15;
      JOptionPane.showMessageDialog(null, "El 15% de " + valor + " es: " + porcentaje);
        
// 4. Algoritmo que calcule lo que gana un empleado con base a las horas 
// trabajadas teniendo en cuenta que cada hora se paga a 2000, adicionalmente 
// se le realiza unos descuentos con respecto a un impuesto de seguridad del 
// 10% sobre su salario.     

       int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas trabajadas:"));
       double salarioBruto = horas * 2000;
       double impuestoSeguridad = salarioBruto * 0.1;
       double salarioNeto = salarioBruto - impuestoSeguridad;
       JOptionPane.showMessageDialog(null, "El salario neto es: " + salarioNeto);
       
       
       
        
    }
        
    }

