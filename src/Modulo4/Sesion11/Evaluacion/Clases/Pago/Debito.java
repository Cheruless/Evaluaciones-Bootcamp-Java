package Modulo4.Sesion11.Evaluacion.Clases.Pago;

public class Debito implements IMetodoPago{
    @Override
    public String pago() {
        return "Realizaste el pago en Débito.";
    }
}
