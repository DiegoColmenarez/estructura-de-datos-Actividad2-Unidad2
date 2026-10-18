package org.exercise7;

import java.util.ArrayList;
import java.util.Scanner;
import static org.exercise7.Ordenamiento.*;

public class Main {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> inventario = cargarDatosPrueba();
        int opcion;
        boolean estaOrdenado = false;
        do {
            System.out.println("\n=== MENÚ DE INVENTARIO ===");
            System.out.println("1) Ordenar los productos");
            System.out.println("2) Listar productos agotados");
            System.out.println("3) Listar productos con poco stock");
            System.out.println("4) Listar los productos");
            System.out.println("0) Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    int desplazamientos = insertSort(inventario);
                    estaOrdenado = true;
                    System.out.println("Inventario ordenado por cantidad.");
                    System.out.println("Desplazamientos realizados: " + desplazamientos);
                    break;
                case 2:
                    if (!estaOrdenado) {
                        System.out.println("Advertencia: Lista no ordenada. Utilizando busqueda lineal...");
                        var agotados = obtenerAgotadosClasico(inventario);
                        mostrarLista(agotados, "PRODUCTOS AGOTADOS");
                    }
                    var agotados = obtenerAgotados(inventario);
                    mostrarLista(agotados, "PRODUCTOS AGOTADOS");
                    break;
                case 3:
                    var pocoStock = obtenerProductosPocaCantidad(inventario);
                    mostrarLista(pocoStock, "PRODUCTOS CON POCO STOCK");
                    break;
                case 4:
                    mostrarLista(inventario, "INVENTARIO COMPLETO");
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 0);
        scanner.close();
    }

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