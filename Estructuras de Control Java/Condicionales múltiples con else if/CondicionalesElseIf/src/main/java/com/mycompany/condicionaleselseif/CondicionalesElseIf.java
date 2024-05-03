/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionaleselseif;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class CondicionalesElseIf {

    public static void main(String[] args) {
// 1. Dado el siguiente cuadro:
    
// 1. Lunes
// 2. Martes
// 3. Miercoles
// 4. Jueves
// 5. Viernes
// 6. Sabado
// 7. Domingo

// Haga un algoritmo que solicite el ingreso de un número e indique el dia 
// correspondiente, valide si el código no existe.

 String codigo = JOptionPane.showInputDialog("Ingrese el código del día:");
        int cod = Integer.parseInt(codigo);
        JOptionPane.showMessageDialog(null, cod);

        if (cod == 1) {
            JOptionPane.showMessageDialog(null, "LUNES");
        } else if (cod == 2) {
            JOptionPane.showMessageDialog(null, "MARTES");
        } else if (cod == 3) {
            JOptionPane.showMessageDialog(null, "MIERCOLES");
        } else if (cod == 4) {
            JOptionPane.showMessageDialog(null, "JUEVES");
        } else if (cod == 5) {
            JOptionPane.showMessageDialog(null, "VIERNES");
        } else if (cod == 6) {
            JOptionPane.showMessageDialog(null, "SABADO");
        } else if (cod == 7) {
            JOptionPane.showMessageDialog(null, "DOMINGO");
        } else {
            JOptionPane.showMessageDialog(null, "EL CODIGO NO EXISTE!");
        }
    }
}
