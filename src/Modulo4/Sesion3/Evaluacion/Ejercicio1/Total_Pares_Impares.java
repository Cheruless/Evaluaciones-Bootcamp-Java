package Modulo4.Sesion3.Evaluacion.Ejercicio1;

import java.util.Scanner;

public class Total_Pares_Impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 100;
        int num, pares = 0, impares = 0;

        do {
            System.out.println("Ingrese un número de 1 al 100");
            num = sc.nextInt();
            if ( !(num >= 1 && num <= MAX) )
                System.out.println("--------------- Error");
        } while (!(num >= 1 && num <= MAX));

        for (int i = 0; i < num; i++)
            if ((i + 1) % 2 == 0)
                pares++;
            else
                impares++;

        System.out.printf("el total de numeros pares es: %d\n", pares);
        System.out.printf("el total de numeros impares es: %d\n", impares);
        System.out.println("----------- fin del programa");

    }
}
