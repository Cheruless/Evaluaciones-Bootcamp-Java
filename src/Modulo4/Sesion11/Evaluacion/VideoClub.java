package Modulo4.Sesion11.Evaluacion;

import Modulo4.Sesion11.Evaluacion.Clases.GestorPeliculas;
import Modulo4.Sesion11.Evaluacion.Clases.Pelicula;
import Modulo4.Sesion11.Evaluacion.Clases.UsuarioSingleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoClub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioSingleton dueno = crearDueno();
        GestorPeliculas listadoPeliculas = new GestorPeliculas(crearPeliculas());

        int verif = 0;
        do {
            menu();
            switch (sc.nextInt()) {
                case 1 -> listadoPeliculas.verPeliculasAll();
                case 2 -> listadoPeliculas.verPeliculasDisponibles();
                case 3 -> {
                    //Decidi no hacer este proceso en un objeto, porque
                    //no creo muy bien usar Scanner en un objeto.
                    System.out.println("Ingrese el nombre de la pelicula que desea arrendar");
                    sc.nextLine();
                    String tituloPelicula = sc.nextLine();
                    System.out.println("Seleccione Metodo de pago");
                    System.out.println("1.- Débito.");
                    System.out.println("2.- Efectivo.");
                    listadoPeliculas.arrendarPelicula(tituloPelicula, sc.nextInt());
                }
                case 4 -> {
                    System.out.println("Ingrese la pelicula a devolver.");
                    sc.nextLine();
                    String tituloPelicula = sc.nextLine();
                    listadoPeliculas.devolverPelicula(tituloPelicula);
                }
                case 5 -> verif = 1;
                default -> System.out.println("Opcion no valida");
            }
        } while (verif == 0);

    }

    public static void menu() {
        System.out.println("Selecciona la opción:");
        System.out.println("1.- Ver lista de peliculas de la tienda");
        System.out.println("2.- Ver lista de peliculas disponibles para arrendar");
        System.out.println("3.- Arrendar una pelicula");
        System.out.println("4.- Devolver una pelicula");
        System.out.println("5.- Cerrar programa.");
    }

    public static UsuarioSingleton crearDueno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre dueño:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese apellido dueño:");
        String apellido = sc.nextLine();
        return UsuarioSingleton.getInstance(nombre, apellido);
    }

    public static List<Pelicula> crearPeliculas() {
        List<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(new Pelicula("Pozo de la ascensión", 2021, true));
        listaPeliculas.add(new Pelicula("El héroe de las eras", 2019, true));
        listaPeliculas.add(new Pelicula("Nacidos de la bruma", 2022, true));
        listaPeliculas.add(new Pelicula("El camino de los reyes", 2018, true));
        listaPeliculas.add(new Pelicula("Palabras Radiantes", 2020, true));
        return listaPeliculas;
    }
}
