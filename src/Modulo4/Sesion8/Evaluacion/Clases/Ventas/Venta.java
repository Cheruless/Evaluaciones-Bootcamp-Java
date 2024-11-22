package Modulo4.Sesion8.Evaluacion.Clases.Ventas;

import Modulo4.Sesion8.Evaluacion.Clases.Productos.Producto;

import java.util.List;
import java.util.Scanner;

public class Venta implements IVenta {
    private Vendedor vendedor;
    private int ganancia;

    public Venta(Vendedor vendedor, int ganancia) {
        this.vendedor = vendedor;
        this.ganancia = ganancia;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "vendedor=" + vendedor +
                ", ganancia=" + ganancia +
                '}';
    }

    @Override
    public int finalizarCompra(List<Producto> listaProductos) {
        Scanner sc = new Scanner(System.in);
        int montoTotal = 0;
        for (Producto producto : listaProductos)
            montoTotal += producto.getPrecio();

        //Preguntamos si está listo para pagar. Si no, retornamos 0 y no se termina.
        System.out.printf("La venta es de $%d. ¿Finalizamos compra?\n1. Si\n2. No\n", montoTotal);
        if (sc.nextInt() == 2) {
            System.out.println("¡De acuerdo! Te invitamos a continuar echando un vistazo.");
            return 0;
        }

        //Preguntamos si aplica descuento colaborador.
        System.out.println("¿Desea aplicar descuento colaborador 10%?\n1. Si\n2. No\n");
        if (sc.nextInt() == 1)
            montoTotal -= montoTotal * 10 / 100;

        ganancia += montoTotal;
        return montoTotal;
    }

    @Override
    public String obtenerBoleta(List<Producto> listaProductos) {

        String boleta = "BOLETA VENTA\n";
        int i = 0;
        int total = 0;
        for (Producto item : listaProductos) {
            i++;
            boleta += "\t" + i + ". " + item.getNombre() + "\t$" + item.getPrecio() + "\n";
            total += item.getPrecio();
        }
        boleta += "\nAtendido por: " + vendedor.getNombre() + " - " + vendedor.getRut() + "\n";
        boleta += "Monto total: $" + total;

        return boleta;
    }

    @Override
    public String finalizarTurno() {
        return "\nGracias por su turno " + vendedor.getNombre() + ", su ganancia del día fue de $" + ganancia + "\n";
    }
}
