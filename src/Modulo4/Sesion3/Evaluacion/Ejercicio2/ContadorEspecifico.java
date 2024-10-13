package Modulo4.Sesion3.Evaluacion.Ejercicio2;

import java.util.Scanner;

public class ContadorEspecifico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_PEDIDO = 10;
        int count0s = 0, countPos = 0, countNeg = 0;
        int num;

        for (int i = 0; i < MAX_PEDIDO; i++) {
            System.out.printf("Introduce número: ");
            num = sc.nextInt();
            if (num > 0)
                countPos++;
            else if (num == 0)
                count0s++;
            else
                countNeg++;
        }

        System.out.printf("El número de ceros introducidos es de: %d\n", count0s);
        System.out.printf("El número de positivos introducidos es de: %d\n", countPos);
        System.out.printf("El número de negativos introducidos es de: %d\n", countNeg);
    }
}
