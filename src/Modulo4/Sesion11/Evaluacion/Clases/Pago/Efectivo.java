package Modulo4.Sesion11.Evaluacion.Clases.Pago;

public class Efectivo implements IMetodoPago{
    @Override
    public String pago(){
        return "Realizaste el pago en Efectivo.";
    }
}
