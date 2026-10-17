package org.exercise7;

import java.util.ArrayList;

public class Ordenamiento {

    public static void insertSort(ArrayList<Producto> productos) {
        for (int i = 1; i < productos.size(); i++) {
            var actual = productos.get(i);
            int anterior = i - 1;
            while (anterior >= 0 && productos.get(anterior).getCantidad() > actual.getCantidad()) {
                productos.set(anterior + 1, productos.get(anterior));
                anterior--;
            }
            productos.set(anterior + 1, actual);
        }
    }
}
