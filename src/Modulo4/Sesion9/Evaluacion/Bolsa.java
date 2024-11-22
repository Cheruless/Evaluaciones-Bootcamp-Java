package Modulo4.Sesion9.Evaluacion;

import Modulo4.Sesion9.Evaluacion.Clases.BolsaDeCompra;
import Modulo4.Sesion9.Evaluacion.Clases.Polera;
import Modulo4.Sesion9.Evaluacion.Clases.Zapato;

import java.util.Scanner;

public class Bolsa {
    public static void main(String[] args) {
        Zapato z1 = new Zapato("Sadida");
        Zapato z2 = new Zapato("Nykes");
        Zapato z3 = new Zapato("Puna");
        Zapato z4 = new Zapato("Conversa");
        Zapato z5 = new Zapato("Ribook");
        Zapato[] zapatos = new Zapato[]{z1, z2, z3, z4, z5};

        Polera p1 = new Polera("Rojo");
        Polera p2 = new Polera("Verde");
        Polera p3 = new Polera("Azul");
        Polera p4 = new Polera("Blanco");
        Polera p5 = new Polera("Negro");
        Polera[] poleras = new Polera[]{p1, p2, p3, p4, p5};


        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingrese la cantidad de productos MAX 5.");
        int tam = sc.nextInt();

        Polera[] polerasTam = new Polera[tam];
        Zapato[] zapatosTam = new Zapato[tam];

        System.arraycopy(poleras, 0, polerasTam, 0, tam);
        System.arraycopy(zapatos, 0, zapatosTam, 0, tam);

        BolsaDeCompra<Zapato> bolsaZapato = new BolsaDeCompra<>(zapatosTam);
        BolsaDeCompra<Polera> bolsaPolera = new BolsaDeCompra<>(polerasTam);

        System.out.println(bolsaZapato.toString());
        System.out.println(bolsaPolera.toString());
    }
}
