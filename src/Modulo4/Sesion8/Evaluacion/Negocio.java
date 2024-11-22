package Modulo4.Sesion8.Evaluacion;

import Modulo4.Sesion8.Evaluacion.Clases.GestorProductos;
import Modulo4.Sesion8.Evaluacion.Clases.Productos.Producto;
import Modulo4.Sesion8.Evaluacion.Clases.Productos.Vegetales;
import Modulo4.Sesion8.Evaluacion.Clases.Productos.Vestuario;
import Modulo4.Sesion8.Evaluacion.Clases.Ventas.Vendedor;
import Modulo4.Sesion8.Evaluacion.Clases.Ventas.Venta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Negocio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Inicializamos los productos existentes en nuestro negocio.
        GestorProductos listaProductos = new GestorProductos(crearProductos()),
                carroCompra = new GestorProductos();

        Venta venta = new Venta(new Vendedor().registrarVendedor(), 0);

        int valorVenta, salir = 0;

        do {
            System.out.printf("¿Qué hacemos %s?\n", venta.getVendedor().getNombre());
            System.out.println("1. Ver productos disponibles.");
            System.out.println("2. Agregar productos al carro.");
            System.out.println("3. Ver productos en carro");
            System.out.println("4. Pagar carro");
            System.out.println("5. Salir");

            switch (sc.nextInt()) {
                case 1:
                    listaProductos.mostrarProductos();
                    break;
                case 2:
                    carroCompra.agregarProducto(listaProductos.getLista());
                    break;
                case 3:
                    carroCompra.mostrarProductos();
                    break;
                case 4:
                    valorVenta = venta.finalizarCompra(carroCompra.getLista());
                    if (valorVenta != 0) {
                        System.out.println(venta.obtenerBoleta(carroCompra.getLista()));
                        System.out.printf("Monto cancelado: $%d\n\n", valorVenta);
                        carroCompra.limpiarProductos();
                    }
                    break;
                case 5:
                    System.out.println(venta.finalizarTurno());
                    salir = 1;
                    break;
                default:
                    System.out.println("\nOpcion no valida");
                    break;
            }
        } while (salir == 0);
    }

    public static List<Producto> crearProductos() {
        List<Producto> lista = new ArrayList<>();

        //Creamos 3 productos de cada categoria.
        //  VEGETALES
        Producto vege1 = new Vegetales("Frutilla 500g.", 78001, 4690, "19-11-2024", "04-12-2025");
        Producto vege2 = new Vegetales("Palta Hass 1kg.", 78002, 1290, "19-11-2024", "04-12-2025");
        Producto vege3 = new Vegetales("Espinaca 900g.", 78003, 990, "19-11-2024", "04-12-2025");

        //  VESTUARIO
        Producto vest1 = new Vestuario("Polera MHB", 78004, 9990, "M", "Verde");
        Producto vest2 = new Vestuario("Pantalon GTR", 78005, 12990, "40", "Beige");
        Producto vest3 = new Vestuario("Zapatillas Conversa", 78006, 29990, "41", "Blanco");

        //Agregamos a la lista de productos.
        lista.add(vege1);
        lista.add(vege2);
        lista.add(vege3);
        lista.add(vest1);
        lista.add(vest2);
        lista.add(vest3);

        //La retornamos.
        return lista;
    }
}