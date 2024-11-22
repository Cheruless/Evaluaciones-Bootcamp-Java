package Modulo4.Sesion8.Evaluacion.Clases;

import Modulo4.Sesion8.Evaluacion.Clases.Productos.Producto;

import java.util.List;

public interface IGestorProductos {
    void agregarProducto(List<Producto> productos);
    void mostrarProductos();
    void limpiarProductos();
}
