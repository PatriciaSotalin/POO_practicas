package examen;

import java.util.Scanner;

public class Proyecto {

	public static void main(String[] args) {
		alumno alumno1=new  alumno();
		profesor profesor1=new profesor();
		int op;
		Scanner sc=new Scanner(System.in);
		String nombre;
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
			    nombre=(sc.next());
				profesor1.guardasDatos(nombre);
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
			case 5:
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

		