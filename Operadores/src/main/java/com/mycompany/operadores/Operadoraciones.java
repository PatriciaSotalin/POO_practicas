/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operadores;

import javax.swing.JOptionPane;

public class Operadoraciones {
    int num1;
    int num2;
    int suma; int resta; int multiplicacion; int division;
    


public void capturarnumeros(){
num1 = Integer.parseInt(JOptionPane.showInputDialog( "Deme un Primer numero"));
num2 = Integer.parseInt(JOptionPane.showInputDialog( "Deme un Segundo numero"));
}

public void sumar (){

suma=num1+num2;
}

public void resultados(){

System.out.println("El resultdo de la suma es:"+suma);
}
}
