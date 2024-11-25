package Modulo4.Sesion11.Evaluacion.Clases.Pago;

public class MetodoPago {
    public static IMetodoPago getFormaPago(int opc) {
        return switch (opc) {
            case 1 -> new Debito();
            case 2 -> new Efectivo();
            default -> null;
        };
    }
}
