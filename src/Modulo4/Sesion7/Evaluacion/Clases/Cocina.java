package Modulo4.Sesion7.Evaluacion.Clases;

import Modulo4.Sesion7.Evaluacion.Interfaces.ICocina;

public class Cocina extends Producto implements ICocina {
    private int cantQuemadores;

    public Cocina(String nombre, int precio, int cantidad, int cantQuemadores) {
        super(nombre, precio, cantidad);
        this.cantQuemadores = cantQuemadores;
    }

    public Cocina(){
        super();
    }

    //GETTER Y SETTER
    public int getCantQuemadores() {
        return cantQuemadores;
    }

    private void setCantQuemadores(int cantQuemadores) {
        this.cantQuemadores = cantQuemadores;
    }

    @Override
    public void cambiarPrecio(int precio) {
        this.setPrecio(precio);
    }

    public boolean cantidadDisponible() {
        if (this.getCantidad() != 0) {
            System.out.printf("Nueva cantidad de cocinas disponible: %d\n", this.getCantidad());
            return true;
        }
        System.out.printf("Tenemos %d unidades disponibles. ¡Actualizaremos Stock pronto!\n", this.getCantidad());
        return false;
    }

    @Override
    public int incluyeGas(int valorGas) {
        return (this.getPrecio() + valorGas);
    }
}
