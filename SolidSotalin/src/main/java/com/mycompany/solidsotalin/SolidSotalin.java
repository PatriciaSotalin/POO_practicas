/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solidsotalin;

/**
 *
 * @author USER
 */
public class SolidSotalin {
  public static void main(String[] args) {
        ClienteImpresion cliente = new ClienteImpresion();

        ImpresoraBasica impresoraBasica = new ImpresoraBasica();
        cliente.imprimirDocumentoSimple(impresoraBasica);

        ImpresoraColor impresoraColor = new ImpresoraColor();
        cliente.imprimirDocumentoSimple(impresoraColor);
    }
}

// Interfaz para la impresión de documentos simples
interface ImpresionDocumentoSimple {
    void imprimir();
}

// Interfaz para la impresión de documentos a color
interface ImpresionDocumentoColor {
    void imprimirEnColor();
}

// Clase que representa un dispositivo de impresión básico
class ImpresoraBasica implements ImpresionDocumentoSimple {
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo documento simple en blanco y negro.");
    }
}

// Clase que representa un dispositivo de impresión a color
class ImpresoraColor implements ImpresionDocumentoSimple, ImpresionDocumentoColor {
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo documento simple en color.");
    }

    @Override
    public void imprimirEnColor() {
        System.out.println("Imprimiendo documento a color.");
    }
}

// Clase cliente que utiliza dispositivos de impresión
class ClienteImpresion {
    public void imprimirDocumentoSimple(ImpresionDocumentoSimple impresora) {
        impresora.imprimir();
    }
}



  