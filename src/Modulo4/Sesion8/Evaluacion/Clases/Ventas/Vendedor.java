package Modulo4.Sesion8.Evaluacion.Clases.Ventas;

import java.util.Scanner;

public class Vendedor implements IVendedor{
    private String nombre;
    private String rut;

    public Vendedor(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public Vendedor(){}

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    @Override
    public Vendedor registrarVendedor() {
        Scanner sc = new Scanner(System.in);
        String nombre, rut = nombre = null;
        do {
            //Solo puede ingresarse letras y espacios.
            if (nombre == null || nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+]")) {
                System.out.println("Ingrese su nombre.");
                nombre = sc.nextLine();
            }
            //Un largo inicial de 7-8 y digitos del 0-9 con GUION (digito o kK)
            if (rut == null || !rut.matches("\\d{7,8}-[0-9kK]")) {
                System.out.println("Ingrese su rut sin punto, con guion y digito verificador. EJ: '20781618-7'.");
                rut = sc.nextLine();
            }
        } while (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+]") && !rut.matches("\\d{7,8}-[0-9kK]"));

        return new Vendedor(nombre, rut);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                '}';
    }

}
