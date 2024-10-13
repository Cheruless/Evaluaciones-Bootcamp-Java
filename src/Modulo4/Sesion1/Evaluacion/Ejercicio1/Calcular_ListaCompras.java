package Modulo4.Sesion1.Evaluacion.Ejercicio1;

public class Calcular_ListaCompras {
    public static void main(String[] args) {
        int cocina = 299990;
        int lavadora = 234540;
        int comedor = 159990;
        int televisor = 345100;

        final double IVA = 19.0/100;
        final double DOLAR = 926.68; // https://cuex.com/es/usd-clp
        double total;
        double totalIva;

        /* Deberá calcular el total, el IVA (19%), el total más IVA (Impuesto al Valor Agregado) y
         * finalmente el total en dólares (consulte el valor del dólar).
         */

        total = cocina + lavadora + comedor + televisor;
        System.out.printf("El total de su compra es: %.0f\n", total);

        totalIva = total * IVA;
        System.out.printf("El IVA es : %.1f\n", totalIva);

        total += totalIva;
        System.out.printf("El total más IVA es: %.1f\n", total);

        total /= DOLAR;
        System.out.printf("El total de su compra en dolares es: %.2f\n", total);
    }
}
