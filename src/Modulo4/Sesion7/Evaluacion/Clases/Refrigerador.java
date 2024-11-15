package Modulo4.Sesion7.Evaluacion.Clases;

import Modulo4.Sesion7.Evaluacion.Interfaces.IProducto;

public class Refrigerador extends Producto implements IProducto {
    private char tipoGastoElectrico;
    private int numPuertas;

    public Refrigerador(String nombre, int precio, int cantidad, char tipoGastoElectrico, int numPuertas) {
        super(nombre, precio, cantidad);
        this.tipoGastoElectrico = tipoGastoElectrico;
        this.numPuertas = numPuertas;
    }

    //GETTERS
    public int getNumPuertas() {
        return numPuertas;
    }

    public char getTipoGastoElectrico() {
        return tipoGastoElectrico;
    }

    //SETTERS
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setTipoGastoElectrico(char tipoGastoElectrico) {
        this.tipoGastoElectrico = tipoGastoElectrico;
    }

    @Override
    public void cambiarPrecio(int precio) {
        this.setPrecio(precio);
    }

    @Override
    public boolean cantidadDisponible() {
        if (this.getCantidad() != 0) {
            System.out.printf("Nueva cantidad de refrigeradores disponible: %d", this.getCantidad());
            return true;
        }
        System.out.printf("Tenemos %d unidades disponibles. ¡Actualizaremos Stock pronto!", this.getCantidad());
        return false;
    }


}
