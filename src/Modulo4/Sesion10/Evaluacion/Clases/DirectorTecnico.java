package Modulo4.Sesion10.Evaluacion.Clases;

public class DirectorTecnico extends Persona {
    private int anioTrabajador;


    public DirectorTecnico(String nombre, String apellido, int edad, int anioTrabajador) {
        super(nombre, apellido, edad);
        this.anioTrabajador = anioTrabajador;
    }

    public DirectorTecnico(){
        super();
    }

    public int getAnioTrabajador() {
        return anioTrabajador;
    }

    public void setAnioTrabajador(int anioTrabajador) {
        this.anioTrabajador = anioTrabajador;
    }

    @Override
    public String toString() {
        return "DirectorTecnico -> {" +
                "anioTrabajador=" + anioTrabajador +
                ", nombre=" + this.getNombre() +
                ", apellido=" + this.getApellido() +
                ", edad=" + this.getEdad() +
                "} ";
    }

    @Override
    public String hablar() {
        return String.format("El director %s se comunica con su equipo.", this.getNombre());
    }

    @Override
    public String celebrar() {
        return String.format("El director %s celebra junto a su equipo.",this.getNombre());
    }

    @Override
    public String amonestacionAmarilla() {
        return String.format("Han amonestado al director %s con tarjeta amarilla. ",this.getNombre());
    }

    @Override
    public String amonestacionRoja() {
        return String.format("Han amonestado al director %s con tarjeta roja. ",this.getNombre());
    }
}
