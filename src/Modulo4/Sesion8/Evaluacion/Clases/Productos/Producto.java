package Modulo4.Sesion8.Evaluacion.Clases.Productos;

public class Producto{
    protected String nombre;
    protected int codigo;
    protected int precio;

    public Producto(String nombre, int codigo, int precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", precio=" + precio +
                '}';
    }
}