package Modulo4.Sesion5.Evaluacion;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        final int MAX_TAM = 7;
        Scanner sc = new Scanner(System.in);

        Producto prod1 = new Producto("Chocolate", "Chocolate amargo, 500 gr.", 500);
        Producto prod2 = new Producto("Leche", "Leche entera, 1 litro.", 800);
        Producto prod3 = new Producto("Arroz", "Arroz grado 2, 1 kilo.", 900);
        Producto[] productos = new Producto[MAX_TAM];
        productos[0] = prod1;
        productos[1] = prod2;
        productos[2] = prod3;

        do {
            System.out.println("Elija una opción:" +
                    "\n\t1.- Ver productos." +
                    "\n\t2.- Agregar productos." +
                    "\n\t3.- Modificar productos." +
                    "\n\t4.- Salir.");

            switch (sc.nextInt()) {
                case 1:
                    caso1(productos, MAX_TAM);
                    break;
                case 2:
                    caso2(productos, MAX_TAM);
                    break;
                case 3:
                    caso3(productos, MAX_TAM);
                    break;
                case 4:
                    productos = null;
                    System.out.println("Se ha finalizado el programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (productos != null);

    }

    public static void caso1(Producto[] prod, int MAX_TAM) {
        for (int i = 0; i < MAX_TAM && prod[i] != null; i++)
            System.out.printf("%d.- Producto: %s - Valor: %d - Descripción: %s\n",
                    i + 1, prod[i].getNombre(), prod[i].getPrecio(), prod[i].getDescripcion());
    }

    public static void caso2(Producto[] prod, int MAX_TAM) {
        int verif = 0;

        do {
            //Simplemente preguntamos si existe espacio, no me interesa saber cuánto.
            if (prod[MAX_TAM - 1] != null) {
                verif = 1;  //Cambiamos variable para salir del bucle.
                System.out.println("Hemos alcanzado el máximo de productos. Por favor, contactar con desarrollador.");
            } else {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese el nombre del producto: ");
                String nombre = sc.next();
                System.out.println("Ingrese el valor del producto: ");
                int precio = sc.nextInt();
                sc.nextLine(); //Evitamos el salto de línea del buffer del Scanner.
                System.out.println("Ingrese la descripcion del producto: ");
                String descripcion = sc.next();

                //Creamos el producto.
                Producto prodAux = new Producto(nombre, descripcion, precio);

                //Insertamos el producto en la primera casilla vacía.
                for (int i = 0; i < MAX_TAM && verif != 1; i++)
                    if (prod[i] == null) {
                        prod[i] = prodAux;
                        verif = 1;
                        System.out.println("¡Producto agregado con éxito!");
                    }
            }
        } while (verif != 1);
    }

    public static void caso3(Producto[] prod, int MAX_TAM) {
        caso1(prod, MAX_TAM);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el índice que desea modificar: ");
        int pos = sc.nextInt() - 1;
        int fin = 0;

        //Preguntamos si existe el producto buscado antes de ejecutar sino cometemos grave error.
        if (prod[pos] == null) {
            System.out.println("El producto no existe. Revisa bien.");
        } else {
            do {
                System.out.println("¿Qué desea modificar?" +
                        "\n\t1.- Modificar nombre. --> " + prod[pos].getNombre() +
                        "\n\t2.- Modificar descripción. --> " + prod[pos].getDescripcion() +
                        "\n\t3.- Modificar precio. --> " + prod[pos].getPrecio() +
                        "\n\t4.- Salir.");
                switch (sc.nextInt()) {
                    case 1:
                        sc.nextLine();
                        System.out.printf("NOMBRE: ");
                        prod[pos].setNombre(sc.nextLine());
                        System.out.println("Nombre modificado.\n");
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.printf("DESCRIPCION: ");
                        prod[pos].setDescripcion(sc.nextLine());
                        System.out.println("Descripción modificada.");
                        break;
                    case 3:
                        System.out.printf("PRECIO: ");
                        prod[pos].setPrecio(sc.nextInt());
                        System.out.println("Precio modificado.");
                        break;
                    case 4:
                        System.out.println("Entendido.");
                        fin = 1;
                        break;
                    default:
                        System.out.println("Selección errónea.");
                        break;
                }
            } while (fin != 1);
        }
    }
}
