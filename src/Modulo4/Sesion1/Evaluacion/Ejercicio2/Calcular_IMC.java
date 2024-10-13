package Modulo4.Sesion1.Evaluacion.Ejercicio2;

import java.util.Scanner;

public class Calcular_IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, altura, imc;

        /* Deberá solicitar el peso (en kilogramos) y la altura (en metros).
         * Después de eso deberá́ calcular el IMC (Índice de Masa Muscular) de la persona que ingreso el dato
         */

        System.out.println("Ingrese su peso en Kg:");
        peso = sc.nextDouble();

        System.out.println("Ingrese su altura en metros:");
        altura = sc.nextDouble();

        System.out.println("Calculando su IMC. . . .");
        imc = peso / (altura * altura);

        System.out.printf("Su indice de masa muscular es: %.1f\n", imc);
    }
}
