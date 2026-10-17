package org.exercise7;

import java.util.ArrayList;

public class Ordenamiento {

    public static int insertSort(ArrayList<Producto> productos) {
        int desplazamientos = 0;
        for (int i = 1; i < productos.size(); i++) {
            var actual = productos.get(i);
            int anterior = i - 1;
            while (anterior >= 0 && productos.get(anterior).getCantidad() > actual.getCantidad()) {
                productos.set(anterior + 1, productos.get(anterior));
                desplazamientos++;
                anterior--;
            }
            productos.set(anterior + 1, actual);
        }
        return desplazamientos;
    }

    public static ArrayList<Producto> obtenerProductosSinStock(ArrayList<Producto> productos){
        ArrayList<Producto> resultado = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCantidad() == 0) {
                resultado.add(producto);
            }
        }
        return resultado;
    }

    public static ArrayList<Producto> obtenerProductosPocaCantidad(ArrayList<Producto> productos){
        ArrayList<Producto> resultado = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCantidad() < producto.getCantidadMin()){
                resultado.add(producto);
            }
        }
        return resultado;
    }

    public static ArrayList<Producto> obtenerAgotados(ArrayList<Producto> productosOrdenados) {
        ArrayList<Producto> agotados = new ArrayList<>();
        for (Producto p : productosOrdenados) {
            if (p.getCantidad() == 0) {
                agotados.add(p);
            } else {
                break;
            }
        }
        return agotados;
    }
}
