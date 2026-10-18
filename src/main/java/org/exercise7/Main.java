package org.exercise7;

import java.util.ArrayList;

public class Main {
    private static void mostrarLista(ArrayList<Producto> lista, String titulo) {
        System.out.println("\n--- " + titulo + " ---");
        if (lista.isEmpty()) {
            System.out.println("No hay productos en esta categoría.");
            return;
        }
        for (Producto p : lista) {
            System.out.println("- " + p.getNombre() + " | Cantidad: " + p.getCantidad() + " | Mínimo: " + p.getCantidadMin());
        }
    }

    private static ArrayList<Producto> cargarDatosPrueba() {
        ArrayList<Producto> lista = new ArrayList<>();
        lista.add(new Producto("Leche", 5, 10));
        lista.add(new Producto("Arroz", 50, 20));
        lista.add(new Producto("Huevos", 0, 30));
        lista.add(new Producto("Carne", 0, 5));
        lista.add(new Producto("Pan", 100, 10));
        lista.add(new Producto("Queso", 2, 5));
        lista.add(new Producto("Queso Azul", 10, 5));
        lista.add(new Producto("Harina", 80,34));
        lista.add(new Producto("Tomates", 2, 50));
        lista.add(new Producto("Cloro", 100, 41));
        lista.add(new Producto("Jabon", 200, 90));
        lista.add(new Producto("Yogur", 32, 27));
        return lista;
    }
}