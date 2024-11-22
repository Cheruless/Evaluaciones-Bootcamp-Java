package Modulo4.Sesion8.Evaluacion.Clases.Ventas;

import Modulo4.Sesion8.Evaluacion.Clases.Productos.Producto;

import java.util.List;

public interface IVenta {
    int finalizarCompra(List<Producto> listaProductos);
    String obtenerBoleta(List<Producto> listaProductos);
    String finalizarTurno();
}
