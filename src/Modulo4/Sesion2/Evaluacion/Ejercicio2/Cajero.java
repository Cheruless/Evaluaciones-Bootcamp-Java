package Modulo4.Sesion2.Evaluacion.Ejercicio2;

import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000;

        System.out.println("Seleccione la opción:");
        System.out.println("1. Depositar dinero a mi cuenta");
        System.out.println("2. Retirar dinero de mi cuenta");
        System.out.println("3. Salir");

        switch (sc.nextInt()) {
            case 1:
                System.out.printf("Su saldo inicial es: %.1f\n", saldo);
                System.out.println("Digite la cantidad que desea depositar");
                saldo += sc.nextDouble();
                System.out.printf("Saldo Actual: %.1f\n", saldo);
                break;
            case 2:
                System.out.printf("Su saldo inicial es: %.1f\n", saldo);
                System.out.println("Digite la cantidad que desea retirar");
                double retiro = sc.nextDouble();
                if (retiro < saldo) {
                    saldo -= retiro;
                    System.out.printf("Saldo Actual: %.1f\n", saldo);
                    break;
                }
                System.out.println("Saldo insuficiente.");
                break;
            case 3:
                System.out.println("Saliendo. . .");
                break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }

        System.out.println("Gracias por operar con nostros.");
    }
}
