package org.exercise7;

public class Producto {

    private int cantidad;
    private int cantidadMin;
    private String nombre;

    public  Producto(String nombre, int cantidad, int cantidadMin){
        controlFallos(cantidad);
        cantidadMinFallo(cantidadMin);
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.cantidadMin = cantidadMin;
    }

    private static void controlFallos(int cantidad){
        if (cantidad < 0){
            throw new RuntimeException("");
        }
    }

    private static void cantidadMinFallo(int cantidadMin){
        if (cantidadMin <= 0){
            throw new RuntimeException("");
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        controlFallos(cantidad);
        this.cantidad = cantidad;
    }

    public int getCantidadMin() {
        return cantidadMin;
    }

    public void setCantidadMin(int cantidadMin) {
        cantidadMinFallo(cantidadMin);
        this.cantidadMin = cantidadMin;
    }
}
