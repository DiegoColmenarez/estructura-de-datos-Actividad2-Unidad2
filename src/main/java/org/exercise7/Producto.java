package org.exercise7;

public class Producto {
    private final int cantidad;

    public  Producto(int cantidad){
        controlFallos(cantidad);
        this.cantidad = cantidad;
    }

    private static void controlFallos(int cantidad){
        if (cantidad < 0){
            throw new RuntimeException("");
        }
    }

    public int getCantidad() {
        return cantidad;
    }
}
