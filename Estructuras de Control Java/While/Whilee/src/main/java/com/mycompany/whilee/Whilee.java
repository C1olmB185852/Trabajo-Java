/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whilee;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Whilee {

    public static void main(String[] args) {

// 1. Haga un algoritmo que solicite el nombre de n cantidad de personas e imprima
// un saludo, el usuario ingresará la cantidad de personas a validar.  

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces a repetir"));
	int i = 0;
	while (i < n) {
	String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
	System.out.println("Hola " + nombre + " bienvenido!\n");
	i++;
	}
	System.out.println("\n Terminó el ciclo!");
	System.out.println("Se repitió " + n + " veces");
        
// 2. Haga un algoritmo que solicite el nombre de n cantidad de personas que 
// llegan a una clase, se permitirá el ingreso hasta que el usuario decida, 
// el sistema deberá indicar al final la cantidad de personas que llegaron  

        String resp = "si";
	int cont = 0;
	while (resp.equals("si")) {
	String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
	System.out.println("Hola " + nombre + " bienvenido a la clase!\n");
        cont++;
        resp = JOptionPane.showInputDialog("Ingrese si, si hay más personas: ");
	}
	System.out.println("Llegaron " + cont + " Personas!");
	System.out.println("Fin del Ciclo!");
        
// 3. - Algoritmo que solicite 2 numeros y realice el siguiente proceso del menú
    
// 1. Sumar
// 2. Restar
// 3. Multiplicar
// 4. Dividir 
// 5. Finalizar
    
// Haga el sistema con ciclos y valide que el segundo numero no sea negativo o 
// cero en la opción 4

	String menu = "MENU OPERACIONES\n\n";
				menu += "1.Sumar\n";
				menu += "2.Restar\n";
				menu += "3.Multiplicar\n";
				menu += "4.Dividir\n";
				menu += "5.Salir";
				int cod = 0;
				
				while (cod != 5) {
				  int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
				  int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
				  cod = Integer.parseInt(JOptionPane.showInputDialog(menu + "\nIngrese la opcion del menú: "));
				
				  switch (cod) {
				    case 1:
				      int resultado = num1 + num2;
				      System.out.println("SUMA: " + num1 + "+" + num2 + "=" + resultado);
				      break;
				    case 2:
				      resultado = num1 - num2;
				      System.out.println("RESTA: " + num1 + "-" + num2 + "=" + resultado);
				      break;
				    case 3:
				      resultado = num1 * num2;
				      System.out.println("MULTIPLICACION: " + num1 + "*" + num2 + "=" + resultado);
				      break;
				    case 4:
				      if (num2 > 0) {
				        resultado = num1 / num2;
				        System.out.println("DIVISION: " + num1 + "/" + num2 + "=" + resultado);
				      } else {
				        System.out.println("No puede hacer división por 0");
				      }
				      break;
				    case 5:
				      System.out.println("\nFinalizar\n");
				      break;
				    default:
				      System.out.println("Valor Incorrecto");
				  }
				}

    }
}
