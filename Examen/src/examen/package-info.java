package examen;
public class examen{
	
}
/**
 * 
 */
/**
 * @author ESPE
 *
 */
module Examen_POO {
}
package notas;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
GestionNotas gnotas=new GestionNotas();
int op;
Scanner sc=new Scanner(System.in);
double notas;
do {
System.out.println("1. Agregar Profesores:  ");
System.out.println("2. Agregar Alumnos:  ");	
System.out.println("3. Ver Materias:  ");	
System.out.println("4. Ingresar gestiones ");
System.out.println("5. Total de Matriculados");
System.out.println("6. Salir  ");	
op=Integer.parseInt(sc.next());
switch (op) {
case 1:
	System.out.println("Agregar Profesores:");
    notas=Double.parseDouble(sc.next());
    gnotas.guardarNotas(notas);
    
	break;
case 2:
	System.out.println ("Agregar Alumnos:");
	break;
case 3:
	System.out.println("Ver Materias :");
	break;
case 4:
	System.out.println("Ingresar gestiones :");
	break;
case 4:
	System.out.println("Total de matriculados:");
	
case 6:
	System.out.println("Selecciono salir, vuela pronto :)");
	break;
	default:
	System.out.println("Ingres euna opcion valida.");
}
}while(op!=6);

}
	
}