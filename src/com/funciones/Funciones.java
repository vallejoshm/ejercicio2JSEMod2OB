package com.funciones;

public class Funciones {

    public static double precioConIva(double precioSinIva){
        double iva = 21/100;
        return (precioSinIva * iva) + precioSinIva;
    }
}
