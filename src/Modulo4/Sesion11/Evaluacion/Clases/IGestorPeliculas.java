package Modulo4.Sesion11.Evaluacion.Clases;

public interface IGestorPeliculas {
    void verPeliculasDisponibles();
    void verPeliculasAll();
    void arrendarPelicula(String pelicula, int pago);
    void devolverPelicula(String pelicula);
}
