package Modulo4.Sesion11.Evaluacion.Clases;

import Modulo4.Sesion11.Evaluacion.Clases.Pago.IMetodoPago;
import Modulo4.Sesion11.Evaluacion.Clases.Pago.MetodoPago;

import java.util.List;

public class GestorPeliculas implements IGestorPeliculas {
    private List<Pelicula> listaPeliculas;

    public GestorPeliculas(List<Pelicula> peliculas) {
        this.listaPeliculas = peliculas;
    }


    @Override
    public void verPeliculasDisponibles() {
        String peliculas = "\nPeliculas disponibles en tienda\n";
        int cantDisponible = 0;
        for (Pelicula pelicula : listaPeliculas)
            if (!pelicula.isArriendo()) {
                peliculas += "\t" + pelicula.getData() + "\n";
                cantDisponible++;
            }

        if (cantDisponible == 0)
            System.out.println("No hay peliculas disponibles para arrendar.");
        else
            System.out.println(peliculas);
    }

    @Override
    public void verPeliculasAll() {
        String peliculas = "\nCatálogo de peliculas\n";
        for (Pelicula pelicula : listaPeliculas)
            peliculas += "\t" + pelicula.getData() + "\n";

        System.out.println(peliculas);
    }

    @Override
    public void arrendarPelicula(String titulo, int opcionPago) {
        for (Pelicula pelicula : listaPeliculas)
            if (!pelicula.isArriendo() &&  pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                IMetodoPago metodoPago = MetodoPago.getFormaPago(opcionPago);

                //Si no se aprueba metodo de pago, tenemos error.
                if (metodoPago != null) {
                    pelicula.setArriendo(true);
                    System.out.printf("Titulo: %s ha sido arrendado exitosamente\n", pelicula.getTitulo());
                    System.out.println(metodoPago.pago());
                    return;
                }
            }
        System.out.println("No se encuentra disponible o no está en nuestro catálogo. Disculpe.");
    }

    @Override
    public void devolverPelicula(String titulo) {
        for (Pelicula pelicula : listaPeliculas)
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                pelicula.setArriendo(false);
                System.out.printf("Titulo: %s ha sido devuelto. Gracias por su preferencia.\n", pelicula.getTitulo());
                return;
            }

        System.out.println("No tenemos orden de devolución de esa pelicula. Por favor contactar soporte.");
    }
}
