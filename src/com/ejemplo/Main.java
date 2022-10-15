package com.ejemplo;

import static com.funciones.Funciones.precioConIva;

public class Main {

    public static void main(String[] args) {

        double precio = 35;
        double precioConIva = precioConIva(precio);
        System.out.println("El precio con iva incluido es: " + precioConIva);
    }
}
