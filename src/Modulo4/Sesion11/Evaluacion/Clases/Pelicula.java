package Modulo4.Sesion11.Evaluacion.Clases;

public class Pelicula {
    private final String titulo;
    private final int anioEstreno;
    private boolean arriendo;

    public Pelicula(String titulo, int anioEstreno, boolean arriendo) {
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.arriendo = arriendo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isArriendo() {
        return arriendo;
    }

    public void setArriendo(boolean arriendo) {
        this.arriendo = arriendo;
    }

    public String getData(){
        String data = "(";
        data += titulo;
        data += ", ";
        data += anioEstreno;
        data += ", ";
        data += arriendo ? "Arrendada" : "Disponible";
        data += ")";
        return String.format(data);
    }
}
