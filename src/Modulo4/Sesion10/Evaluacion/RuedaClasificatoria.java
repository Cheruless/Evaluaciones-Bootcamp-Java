package Modulo4.Sesion10.Evaluacion;

import Modulo4.Sesion10.Evaluacion.Clases.DirectorTecnico;
import Modulo4.Sesion10.Evaluacion.Clases.Jugador;
import Modulo4.Sesion10.Evaluacion.Clases.Persona;

import java.util.ArrayList;
import java.util.List;

public class RuedaClasificatoria {
    public static void main(String[] args) {
        List<Persona> miembrosEquipo = new ArrayList<>();

        miembrosEquipo.add(new DirectorTecnico("Jorge", "Fernandez", 50, 10));
        miembrosEquipo.add(new Jugador("Exequiel", "Pulgar", 23, 1, "Defensa"));
        miembrosEquipo.add(new Jugador("Samuel", "Jerezeh", 28, 2, "Portero"));

        /*
        miembrosEquipo.add(new Jugador("Carlos", "Mendoza", 26, 3, "Defensa"));
        miembrosEquipo.add(new Jugador("Andrés", "Lopez", 24, 4, "Mediocampista"));
        miembrosEquipo.add(new Jugador("Javier", "Torres", 22, 5, "Defensa"));
        miembrosEquipo.add(new Jugador("Felipe", "Rojas", 27, 6, "Mediocampista"));
        miembrosEquipo.add(new Jugador("Daniel", "Alvarez", 25, 7, "Delantero"));
        miembrosEquipo.add(new Jugador("Cristian", "Morales", 21, 8, "Mediocampista"));
        miembrosEquipo.add(new Jugador("Luis", "Gómez", 23, 9, "Delantero"));
        miembrosEquipo.add(new Jugador("Matías", "Pérez", 30, 10, "Delantero"));
        miembrosEquipo.add(new Jugador("Ignacio", "Vega", 29, 11, "Defensa"));
        */

        for (Persona persona : miembrosEquipo) {
            System.out.println(persona);
            System.out.println("\t" + persona.hablar());
            System.out.println("\t" + persona.celebrar());
            System.out.println("\t" + persona.amonestacionAmarilla());
            System.out.println("\t" + persona.amonestacionRoja());

            if (persona instanceof Jugador jugador) {
                System.out.println("\t\t" + jugador.correr());
                System.out.println("\t\t" + jugador.saltar());
                System.out.println("\t\t" + jugador.quitarBalon());
            }
        }

    }
}
