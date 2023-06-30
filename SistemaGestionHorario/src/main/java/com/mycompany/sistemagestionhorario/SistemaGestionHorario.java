
package com.mycompany.sistemagestionhorario;
import java.util.Scanner;  //import de la clase Scanner
//import java.util.ArrayList;


public class SistemaGestionHorario {
    
public static void main(String[] args) {
// Ingresar la cantidad de los laboratorios
        Scanner scanner = new Scanner(System.in);
        // Pedir la cantidad de laboratorios a ingresar
        System.out.print("\n Ingrese la cantidad de laboratorios: ");
        int cantidadLaboratorios = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de leer el entero

        Laboratorio[] laboratorios = new Laboratorio[cantidadLaboratorios];

        // Pedir los datos de cada laboratorio
        for (int i = 0; i < cantidadLaboratorios; i++) {
            System.out.print("\n ======================================================== ");
            System.out.println("\n Ingrese los datos del laboratorio #" + (i + 1));
            System.out.print("Nombre del laboratorio: ");
            String nombre = scanner.nextLine();
            System.out.print("Capacidad del laboratorio: ");
            int capacidad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el entero
            System.out.print("Equipos del laboratorio (separados por comas): ");
            String[] equipos = scanner.nextLine().split(",");
            System.out.print("\n ======================================================== ");

            // Crear una instancia del laboratorio correspondiente según su tipo
            laboratorios[i] = new Laboratorio1(nombre, capacidad, equipos, "espacio", "lugar");
        }

        // Pedir la cantidad de asignaturas a ingresar
        System.out.print("\n ======================================================== ");
        System.out.print("\n Ingrese la cantidad de asignaturas : ");
        int cantidadAsignaturas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de leer el entero

        Asignatura[] asignaturas = new Asignatura[cantidadAsignaturas];

        // Pedir los datos de cada asignatura
        for (int i = 0; i < cantidadAsignaturas; i++) {
            System.out.print("\n ======================================================== ");
            System.out.println("\n Ingrese los datos de la asignatura #" + (i + 1));
            System.out.print("Nombre de la asignatura: ");
            String nombre = scanner.nextLine();
            System.out.print("Horario de la asignatura: ");
            String horario = scanner.nextLine();
            System.out.print("\n ======================================================== ");

            // Asignar un laboratorio a la asignatura
            System.out.println("\n Seleccione un laboratorio para la asignatura:");
            for (int j = 0; j < cantidadLaboratorios; j++) {
                System.out.println((j + 1) + ". " + laboratorios[j].getNombre());
            }
            int seleccionLaboratorio = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el entero

            // Crear una instancia de la asignatura y asignar el laboratorio correspondiente
            asignaturas[i] = new Asignatura(nombre, horario, laboratorios[seleccionLaboratorio - 1]);
        }

        // Mostrar información de los laboratorios
        System.out.print("\n ======================================================== ");
        System.out.println("\n Información de los laboratorios:");
        for (Laboratorio laboratorio : laboratorios) {
            System.out.println("Nombre: " + laboratorio.getNombre());
            System.out.println("Capacidad: " + laboratorio.getCapacidad());
            System.out.println("Equipos: " + String.join(", ", laboratorio.getEquipos()));
            System.out.println();
        }

        scanner.close();
    }
    }

