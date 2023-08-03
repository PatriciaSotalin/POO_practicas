/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutoria8arreglo;
import java.util.Scanner;
public class Tutoria8Arreglo {

    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("MENU DE ARREGLOS");
            System.out.println("1. Registro de datos");
            System.out.println("2. Ingreso de numeros");
            System.out.println("3. Salir");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    registroDatos();
                    break; 
                case 2:
                    ingresoNumeros();
                    break;
                case 3:
                    System.out.println("Finalizando el programa...");
                    break;
                default:
                    System.out.println("La opcion es incorrecta");
            }
        }while(opcion !=3);
    }
    static void registroDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas que va a registrar");
        int cantPersonas = leer.nextInt();
        String [] nombres = new String [cantPersonas];
        int []edades = new int[cantPersonas];
        String[] direcciones = new String[cantPersonas];
        for(int i=0; i<cantPersonas; i++){
            System.out.println("=> Personas "+(i+1)+" :");
            System.out.println("Nombre: ");
            String nombre= leer.nextLine();
            nombres[i]=nombre;
            leer.nextLine();
            System.out.println("Edad: ");
            int edad = leer.nextInt();
            edades[i]= edad;
            leer.nextLine();
            System.out.println("Direcciones: ");
            String direccion = leer.nextLine();
            direcciones[i]=direccion;
            leer.nextLine();
        }
        System.out.println("====================");
        System.out.println("Registro de datos");
        System.out.println("====================");
        for(int i=0; i<cantPersonas; i++){
            System.out.println("DATOS DE PERSONAS "+(i+1)+" :");
            System.out.println("NOMBRE: "+nombres);
            System.out.println("EDAD: "+edades);
            System.out.println("DIRECCION: "+direcciones);
        }
    
        
        
    }
    static void ingresoNumeros(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que va a ingresar");
        int n = leer.nextInt();
        int [] numeros = new int[n];
        
        for(int i=0; i<n; i++){
            System.out.println("Ingrese el numero "+(i+1)+" :");
            numeros[i]=leer.nextInt();
        }
        System.out.println("Los numeros ingresados en orden son: ");
        for(int i=n-1;i>=0; i-- ){
            System.out.println(numeros[i]);
        }
        
        
    }
}