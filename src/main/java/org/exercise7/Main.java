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
}