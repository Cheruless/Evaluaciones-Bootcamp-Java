package Modulo4.Sesion8.Evaluacion.Clases.Productos;

public class Vestuario extends Producto {
    private final String talla;
    private final String color;

    public Vestuario(String nombre, int codigo, int precio, String talla, String color) {
        super(nombre, codigo, precio);
        this.talla = talla;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vestuario {" +
                "talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
