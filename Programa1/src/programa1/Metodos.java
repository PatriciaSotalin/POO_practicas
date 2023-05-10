/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa1;

import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class Metodos {

    private int p;
    private int x;
    private int num1;
    private int num2;
    private int cantidad;
    private int multiplicacion;
    private int datos;
    private int datos1;
    Scanner leer = new Scanner(System.in);

    public void info() {
        System.out.println("Ingrese el dato primer arreglo");
        x = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el segundo dato del primer arreglo");
        p = leer.nextInt();
        leer.nextLine();
        Metodos array[][] = new Metodos[x][p];
        Metodos array2[][]= new Metodos[x][p];
        System.out.println("Ingrese la cantidad de arreglos que va a ingresar");
        cantidad = leer.nextInt();
        leer.nextLine();
        for (int i = 0; i < cantidad; i++) {
            for (int c = 0; c < cantidad; c++) {
                array[i][c] = new Metodos();
                System.out.println("Ingrese los numeros para el arreglo");
                datos = leer.nextInt();
                leer.nextLine();
                array[i][c].setNum1(datos);
                array2[i][c]= new Metodos();
                System.out.println("Ingrese los numeros para el arreglo");
                datos = leer.nextInt();
                leer.nextLine();
                array2[i][c].setNum2(datos);
            }
        }
        System.out.println("La multiplicacion de los arreglos fue la siguiente");
        for (int u = 0; u < cantidad; u++) {
            for (int o = 0; o < cantidad; o++) {
                System.out.println(array[u][o].getMultiplicacion());
            }
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getP() {
        return p;
    }

    public int getX() {
        return x;
    }

    public void setP(int p) {
        this.p = p;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void multi(int multiplicacion, int array1[][], int array2[][]) {
        multiplicacion = array1[num1][num2] * array2[num1][num2];
    }
    public int getMultiplicacion() {
        return multiplicacion;
    }

}
