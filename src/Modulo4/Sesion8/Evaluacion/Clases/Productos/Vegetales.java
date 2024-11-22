package Modulo4.Sesion8.Evaluacion.Clases.Productos;

public class Vegetales extends Producto {
    private final String fechaEnvasado;
    private final String fechaCaducidad;

    public Vegetales(String nombre, int codigo, int precio, String fechaEnvasado, String fechaCaducidad) {
        super(nombre, codigo, precio);
        this.fechaEnvasado = fechaEnvasado;
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Vegetales {" +
                "fechaEnvasado='" + fechaEnvasado + '\'' +
                ", fechaCaducidad='" + fechaCaducidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", precio=" + precio +
                '}';
    }
}
