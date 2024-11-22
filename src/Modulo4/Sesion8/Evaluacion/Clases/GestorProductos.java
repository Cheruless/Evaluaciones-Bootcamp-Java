package Modulo4.Sesion8.Evaluacion.Clases;

import Modulo4.Sesion8.Evaluacion.Clases.Productos.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorProductos implements IGestorProductos {
    List<Producto> lista = new ArrayList<>();

    public GestorProductos(List<Producto> lista) {
        this.lista = lista;
    }

    public GestorProductos() {
    }

    public List<Producto> getLista() {
        return lista;
    }

    @Override
    public void agregarProducto(List<Producto> productos) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escanee el producto o ingrese manualmente el código: ");
        int codigoBuscado = sc.nextInt();
        for (Producto producto : productos)
            if (producto.getCodigo() == codigoBuscado) {
                lista.add(producto);
                return;
            }

        System.out.println("No se encontró el producto solicitado. Intente agregar nuevamente.");
    }

    @Override
    public void mostrarProductos() {
        Scanner sc = new Scanner(System.in);
        if (lista.isEmpty())
            System.out.println("Está vacío por aquí :(");
        else
            for (Producto producto : lista)
                System.out.println(producto);

        System.out.println("Pulse ENTER para continuar.");
        sc.nextLine();
    }

    @Override
    public void limpiarProductos() {
        lista.clear();
    }
}
