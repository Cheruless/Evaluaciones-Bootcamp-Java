package Modulo4.Sesion9.Evaluacion.Clases;

import java.util.Arrays;

public class BolsaDeCompra<T> {
    private T[] Producto;

    public BolsaDeCompra(T [] Producto) {
        this.Producto = Producto;
    }

    @Override
    public String toString() {
        return "BolsaDeCompra {" +
                "Producto=" + Arrays.toString(Producto) +
                '}';
    }
}
