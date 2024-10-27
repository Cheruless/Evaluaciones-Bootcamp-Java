package Modulo4.Sesion5.Evaluacion;

public class Producto {
    private String nombre;
    private String descripcion;
    private int precio;

    //CONSTRUCTOR
    public Producto(String nombre, String descripcion, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getPrecio() {
        return precio;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
