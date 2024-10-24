package Modulo4.Sesion4.Evaluacion;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Auto coche = new Auto("Nissan", "Altima", "Beige", 120);
            Scanner sc = new Scanner(System.in);
            System.out.println("Felicidades por su nuevo " + coche.toString());

            do {
                System.out.println("Seleccione que desea hacer");
                System.out.println("1. Encender auto");
                System.out.println("2. Apagar auto");
                System.out.println("3. Acelerar auto");
                System.out.println("4. Salir");

                switch (sc.nextInt()) {
                    case 1:
                        coche.encenderAuto();
                        break;
                    case 2:
                        coche.apagarAuto();
                        break;
                    case 3:
                        coche.acelerar();
                        break;
                    case 4:
                        coche = null;
                        break;
                    default:
                        System.out.println("Opcion no válida");
                        break;
                }
            } while (coche != null);
            System.out.println("¡Hasta la próxima!");
        }
}
