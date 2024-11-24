package Modulo4.Sesion10.Evaluacion.Clases;

public class Jugador extends Persona {
    private int numJugador;
    private String posicion;


    public Jugador(String nombre, String apellido, int edad, int numJugador, String posicion) {
        super(nombre, apellido, edad);
        this.numJugador = numJugador;
        this.posicion = posicion;
    }

    public Jugador(){
        super();
    }

    //GETTERS & SETTERS

    public int getNumJugador() {
        return numJugador;
    }
    public void setNumJugador(int numJugador) {
        this.numJugador = numJugador;
    }

    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    //METODOS

    public String correr(){
        return String.format("El jugador %s está corriendo.", this.getNombre());
    }

    public String saltar(){
        return String.format("El jugador %s salta.", this.getNombre());
    }

    public String quitarBalon(){
        return String.format("El jugador %s ha quitado el balón.", this.getNombre());
    }



    @Override
    public String toString() {
        return "Jugador -> {" +
                "numJugador=" + numJugador +
                ", posicion=" + posicion +
                ", nombre=" + this.getNombre() +
                ", apellido=" + this.getApellido() +
                ", edad=" + this.getEdad() +
                "} ";
    }

    //IMPLEMENT

    @Override
    public String hablar() {
        return String.format("%s se comunica.", this.getNombre());
    }

    @Override
    public String celebrar() {
        return String.format("El %s %s de camiseta %d celebra junto a su equipo.",posicion,this.getNombre(),numJugador);
    }

    @Override
    public String amonestacionAmarilla() {
        return String.format("Han amonestado al %s %s con tarjeta amarilla. ",posicion,this.getNombre());
    }

    @Override
    public String amonestacionRoja() {
        return String.format("Han amonestado al %s %s con tarjeta roja. ",posicion,this.getNombre());
    }
}
