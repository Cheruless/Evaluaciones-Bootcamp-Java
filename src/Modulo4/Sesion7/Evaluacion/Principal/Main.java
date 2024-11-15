package Modulo4.Sesion7.Evaluacion.Principal;

import Modulo4.Sesion7.Evaluacion.Clases.Cocina;
import Modulo4.Sesion7.Evaluacion.Clases.Producto;
import Modulo4.Sesion7.Evaluacion.Clases.Refrigerador;
import jdk.jfr.consumer.RecordedThreadGroup;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Cocina cocina = crearCocina();
        //Refrigerador refrigerador = crearRefrigerador();

        Cocina cocina2 = new Cocina("Mademsa", 400000, 0, 5);
        Refrigerador refrigerador2 = new Refrigerador("Samsung", 350000, 2, 'B', 2);

        probarCompra(cocina2, refrigerador2, 0);

        System.out.println(cocina2.getCantidad());
        System.out.println(refrigerador2.getCantidad());

    }

    public static void probarCompra(Cocina cocina, Refrigerador refrigeradores, int cont) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el producto que desea comprar");
        System.out.println("1. Cocina");
        System.out.println("2. Refrigerador");
        System.out.println("3. Salir");

        switch (sc.nextInt()) {
            case 1:
                if (cocina.cantidadDisponible())
                    ordenCompraCocina(cocina);
                break;
            case 2:
                if (refrigeradores.cantidadDisponible())
                    ordenCompraRefrigerador(refrigeradores);
                break;
            case 3:
                System.out.println("Saliendo...");
                return;
            default:
                System.out.println("Opcion no válida. Intente nuevamente.");
                if (cont == 3)
                    return;
                probarCompra(cocina, refrigeradores, cont + 1);
        }
    }

    public static void ordenCompraRefrigerador(Refrigerador refrigerador) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("--\tRefrigerador marca : %s\n", refrigerador.getNombre());
        System.out.printf("--\tPrecio: %d\n", refrigerador.getPrecio());
        System.out.printf("--\tCantidad de puertas: %d\n", refrigerador.getNumPuertas());
        System.out.printf("--\tTipo de gasto eléctrico: %c\n", refrigerador.getTipoGastoElectrico());
        System.out.println("-----------");

        System.out.println("Y: para continuar || N para cancelar:");
        char continuar = Character.toUpperCase(sc.next().charAt(0));

        switch (continuar) {
            case 'Y':
                System.out.println("Felicidades! Ha comprado su refrigerador!");
                refrigerador.setCantidad(refrigerador.getCantidad() - 1);
                break;
            case 'N':
                System.out.println("Orden cancelada.");
                return;
            default:
                System.out.println("Por favor, Y/N.");
                ordenCompraRefrigerador(refrigerador);
        }
    }

    public static void ordenCompraCocina(Cocina cocina) {
        Scanner sc = new Scanner(System.in);
        int valorGas = 5000;
        System.out.printf("--\tCocina marca: %s\n", cocina.getNombre());
        System.out.printf("--\tPrecio: %d\n", cocina.getPrecio());
        System.out.printf("--\tCantidad de quemadores: %d\n", cocina.getCantQuemadores());
        System.out.println("-----------");

        System.out.println("Y: para continuar || N para cancelar:");
        char continuar = Character.toUpperCase(sc.next().charAt(0));

        switch (continuar) {
            case 'Y':
                sc.nextLine();
                System.out.println("¿Desea incluir un gas por 5000? Si/No:");
                if (sc.nextLine().equalsIgnoreCase("SI")) {
                    System.out.println("Felicidades! Ha comprado su cocina incluyendo un gas por total: $" + cocina.incluyeGas(valorGas));
                    break;
                } else {
                    System.out.println("Felicidades! Ha comprado su cocina.");
                }
                cocina.setCantidad(cocina.getCantidad() - 1);
                break;
            case 'N':
                System.out.println("Orden cancelada.");
                return;
            default:
                System.out.println("Por favor, Y/N.");
                ordenCompraCocina(cocina);
        }

    }

    public static Producto crearProducto(Scanner sc) {
        String nombre = null;
        int precio, cant = precio = 0;
        do {
            //PROCESO DE NOMBRE
            if (nombre == null) {
                System.out.println("Introduzca el nombre");
                nombre = sc.nextLine();
            }

            //PROCESO DE PRECIO
            if (precio == 0) {
                System.out.println("Introduzca el precio (MAYOR QUE 0)");
                precio = sc.nextInt();
            }

            //PROCESO DE CANTIDAD
            if (cant < 2) {
                System.out.println("Introduzca la cantidad (MAYOR QUE 2)");
                cant = sc.nextInt();
            }

        } while (nombre == null || precio == 0 || cant < 2);
        return new Producto(nombre, precio, cant);
    }

    public static Refrigerador crearRefrigerador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCREANDO REFRIGERADOR.");
        Producto prod = crearProducto(sc);

        int cantidadPuertas = 0;
        char gastoElectrico = ' ';
        do {
            if (cantidadPuertas == 0) {
                System.out.println("Introduzca la cantidad de puertas del refrigerador. (MAYOR QUE 0)");
                cantidadPuertas = sc.nextInt();
            }
            if (gastoElectrico < 'A' || gastoElectrico > 'E') {
                System.out.println("Introduzca el tipo de gasto eléctrico:");
                System.out.println("\tA\tB\tC\tD\tE");
                gastoElectrico = Character.toUpperCase(sc.next().charAt(0));
                sc.nextLine();
            }
        } while (cantidadPuertas == 0 || (gastoElectrico < 'A' || gastoElectrico > 'E'));

        return new Refrigerador(prod.getNombre(), prod.getPrecio(), prod.getCantidad(), gastoElectrico,
                cantidadPuertas);
    }

    public static Cocina crearCocina() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCREANDO COCINA");
        Producto prod = crearProducto(sc);

        int cantQuemadores;
        do {
            System.out.println("Introduzca la cantidad de quemadores de la cocina.");
            cantQuemadores = sc.nextInt();
        }
        while (cantQuemadores == 0);

        return new Cocina(prod.getNombre(), prod.getPrecio(), prod.getCantidad(), cantQuemadores);
    }
}