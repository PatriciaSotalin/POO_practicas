/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuprincipaldeportes;

import java.util.Scanner;

public class MenuPrincipalDeportes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deporte[] deportes = new Deporte[10]; // Puedes ajustar el tamaño según sea necesario
        int cantidadDeportes = 0;

        while (true) {
            System.out.println("\n----- Menú Principal de Deportes -----");
            System.out.println("1. Agregar un nuevo deporte");
            System.out.println("2. Mostrar información de un deporte");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
           
                switch (opcion) {
                case 1:
                    if (cantidadDeportes < deportes.length) {
                        System.out.print("Ingrese el nombre del deporte: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese una descripción del deporte: ");
                        String descripcion = scanner.nextLine();
                        System.out.print("Ingrese la cantidad de jugadores: ");
                        int jugadores = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer de entrada

                        System.out.println("Selecciona el tipo de deporte (1 - Fútbol, 2 - Baloncesto): ");
                        int tipoDeporte = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer de entrada

                        if (tipoDeporte == 1) {
                            deportes[cantidadDeportes] = new Futbol(nombre, descripcion, jugadores);
                        } else if (tipoDeporte == 2) {
                            deportes[cantidadDeportes] = new Baloncesto(nombre, descripcion, jugadores);
                        } else {
                            System.out.println("Opción inválida. Selecciona 1 o 2 para el tipo de deporte.");
                            continue;
                        }

                        cantidadDeportes++;
                        System.out.println("Deporte agregado exitosamente.");
                    } else {
                        System.out.println(  "No se pueden agregar más deportes. El límite se ha alcanzado.");
                    }
                    break;
                case 2:
                    if (cantidadDeportes > 0) {
                        System.out.print("Ingrese el nombre del deporte: ");
                        
                      String nombreBuscado = scanner.nextLine();

                        

                          boolean encontrado = false;
                          for (int i = 0; i < cantidadDeportes; i++) {
                              if (deportes[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
                                System.out.println("\nInformación del deporte:");
                                System.out.printnl("Nombre: " + deportes[i].getNombre());
                                System.out.println("Descripción: " + deportes[i].getDescripcion());

                               if (deportes[i] instanceof Futbol) {
                                  
                                   Futbol futbol = (Futbol) deportes[i];
                                    System.out.println("Jugadores: " + futbol.getJugadores());
                                } else if (deportes[i] instanceof Baloncesto) {
                                  Baloncesto baloncesto = (Baloncesto) deportes[i];
                                    System.out.println( System"Jugadores: " + baloncesto.getJugadores());
                                }
                               
            
        
   