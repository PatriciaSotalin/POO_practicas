/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicametodosderetornosdevalores_sotalinadeir;
import javax.swing.JOptionPane;
public class PracticaMetodosderetornosdevalores_SotalinAdeir {

    public static void main(String[] args) {
       Operaciones op1 =new Operaciones ();
       
       int num1 = Integer.parseInt(JOptionPane.showInputDialog( "Deme un Primer numero"));
       int num2 = Integer.parseInt(JOptionPane.showInputDialog( "Deme un Segundo numero"));
       int suma=op1.sumar(num1,num2);
       op1.resultado (suma);
    
}
}
 