package Modulo4.Sesion4.Evaluacion;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private int velocidadMax;
    private boolean encendido;
    private int velocidad;

    //CONSTRUCTOR
    public Auto(String marca, String modelo, String color, int velocidadMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadMax = velocidadMax;
        encendido = false;
        velocidad = 0;
    }

    //METODOS
    public void encenderAuto() {
        if (encendido)
            System.out.println("Ya está encendido.");
        else
            encendido = true;
    }

    public void apagarAuto() {
        if (!encendido)
            System.out.println("Ya está apagado.");
        else
            encendido = false;
    }

    public void acelerar() {
        if (!encendido)
            System.out.println("No se puede acelerar. No está encendido.");
        else if (velocidad < velocidadMax){
            velocidad += 20;
            System.out.printf("Vamos a %d km/h\n", velocidad);
        }
        else
            System.out.println("Respetamos la velocidad máxima.");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", velocidadMax=" + velocidadMax +
                ", encendido=" + encendido +
                ", velocidad=" + velocidad +
                '}';
    }
}