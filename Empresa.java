package Empresa;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Perecedero(101, "Leche", 4.50, 1));
        productos.add(new Perecedero(102, "Queso", 8.20, 2));
        productos.add(new Perecedero(103, "Yogur", 3.80, 4));

        productos.add(new NoPerecedero(201, "Arroz", 5.00, TipoProducto.A));
        productos.add(new NoPerecedero(202, "Atun", 7.50, TipoProducto.B));
        productos.add(new NoPerecedero(203, "Pasta", 4.20, TipoProducto.C));

        for (Producto producto : productos) {
            imprimirFormato1(producto);
        }

        for (Producto producto : productos) {
            imprimirFormato2(producto);
        }
    }

    private static void imprimirFormato1(Producto producto) {
        if (producto instanceof Perecedero) {
            Perecedero perecedero = (Perecedero) producto;
            System.out.println("Perecedero, " + perecedero.getCodigo() + ", "
                    + perecedero.getDescripcion() + ", " + perecedero.getPrecio() + ", "
                    + perecedero.getDiasACaducar());
        } else if (producto instanceof NoPerecedero) {
            NoPerecedero noPerecedero = (NoPerecedero) producto;
            System.out.println("No Perecedero, " + noPerecedero.getCodigo() + ", "
                    + noPerecedero.getDescripcion() + ", " + noPerecedero.getPrecio() + ", "
                    + noPerecedero.getTipo());
        }
    }

    private static void imprimirFormato2(Producto producto) {
        if (producto instanceof Perecedero) {
            Perecedero perecedero = (Perecedero) producto;
            System.out.println("Perecedero, " + perecedero.getCodigo() + ", "
                    + perecedero.getDescripcion() + ", " + perecedero.getPrecio() + ", "
                    + perecedero.getDiasACaducar() + ", " + perecedero.calcularPrecioVenta());
        } else if (producto instanceof NoPerecedero) {
            NoPerecedero noPerecedero = (NoPerecedero) producto;
            System.out.println("No Perecedero, " + noPerecedero.getCodigo() + ", "
                    + noPerecedero.getDescripcion() + ", " + noPerecedero.getPrecio() + ", "
                    + noPerecedero.getTipo() + ", " + noPerecedero.calcularPrecioVenta());
        }
    }
}
