package Modulo4.Sesion7.Evaluacion.Clases;

public class Producto {
    private String nombre;
    private int precio;
    private int cantidad;

    public Producto(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto() {
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public int getCantidad() {
        return cantidad;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    protected void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
