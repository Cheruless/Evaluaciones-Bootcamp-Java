package Modulo4.Sesion2.Evaluacion.Ejercicio1;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura;

        System.out.println("Bienvenido");
        System.out.println("Por favor, ingrese la temperatura de hoy");
        temperatura = sc.nextDouble();
        System.out.printf("Hay %.1f. El tipo de clima hoy es ", temperatura);
        if(temperatura <= 10)
            System.out.printf("Frío");
        else if (temperatura > 10 && temperatura <= 20)
            System.out.printf("Nublado");
        else if (temperatura > 20 && temperatura < 30)
            System.out.printf("Caluroso");
        else if (temperatura >= 30)
            System.out.printf("Tropical");
    }
}
