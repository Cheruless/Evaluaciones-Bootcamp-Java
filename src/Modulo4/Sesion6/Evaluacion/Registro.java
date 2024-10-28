package Modulo4.Sesion6.Evaluacion;

import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        final int MAX_USERS = 10;
        Persona[] listaClientes = new Persona[MAX_USERS];

        for (int i = 0; i < MAX_USERS; i++) {
            listaClientes[i] = crearCliente();
            System.out.printf("Bienvenid@, %s\n", listaClientes[i].getUsuario());
            if (listaClientes[i].isEsMayor())
                System.out.println("Puede pasar a la zona para mayores de 18 años.");
            else
                System.out.println("No puede pasar a la zona para mayores de 18 años.");
            mostrarListaClientes(listaClientes, i + 1);
        }
    }

    public static void mostrarListaClientes(Persona[] lista, int tam) {
        System.out.println("--------------------------------------");
        System.out.println("\nLISTA TOTAL DE USUARIOS REGISTRADOS:");
        for (int i = 0; i < tam; i++)
            System.out.printf("\t%d.- %s\n", i + 1, lista[i].getUsuario());
        System.out.println("--------------------------------------");
    }

    public static Persona crearCliente() {
        Scanner sc = new Scanner(System.in);
        Persona cliente = new Persona();
        cliente.setUsuario(crearUsuario());
        cliente.setPassword(crearPasword());
        cliente.setNombreCompleto(crearNombre());
        cliente.setFechaNacimiento(crearFechaNacimiento());
        return cliente;
    }

    public static String crearUsuario() {
        Scanner sc = new Scanner(System.in);
        String usuario;
        do {
            System.out.println("Ingrese nuevo nombre de usuario");
            usuario = sc.nextLine();
            if (usuario.length() <= 2)
                System.out.println("Mas de 2 caracteres.");
        } while (usuario.length() <= 2);
        return usuario;
    }

    public static String crearPasword() {
        // DEBE TENER > 10 CARACTERES, >= 2 MAYUS, >= 3 NUM O SIMBOLO
        Scanner sc = new Scanner(System.in);
        String pass;
        char caracter;
        int mayus, especial;
        do {
            especial = mayus = 0;
            do {
                System.out.println("Ingrese contraseña");
                pass = sc.nextLine();
                if (pass.length() <= 10)
                    System.out.println("Debe contener MÁS de 10 caracteres");
            } while (pass.length() <= 10);

            // Preguntamos en el for si es que se ha cumplido el requisito,
            // si es así, terminar la consulta ya que cumple requisitos.
            for (int i = 0; i < pass.length() && (mayus < 2 || especial < 3); i++) {
                caracter = pass.charAt(i);
                if (Character.isUpperCase(caracter))
                    mayus++;
                else if (!Character.isLowerCase(caracter))  //Si no es mayus ni minus, es especial por sentido común
                    especial++;
            }

            if (mayus < 2 || especial < 3)
                System.out.println("Contraseña débil." +
                        "\nMínimo 2 MAYUS: tienes " + mayus +
                        "\nMínimo 3 DIGITOS O CARACTER ESPECIAL: tienes " + especial);
        } while (mayus < 2 || especial < 3);

        return pass;
    }

    public static String crearNombre() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int confirm = 0;
        do {
            System.out.println("Ingrese su nombre completo");
            nombre = sc.nextLine();
            System.out.printf("¿Está bien escrito su nombre '%s'? 1 = si | 2 = no : ", nombre);
            confirm = sc.nextInt();
            sc.nextLine();
        } while (confirm != 1);
        return nombre;
    }

    public static String crearFechaNacimiento() {
        Scanner sc = new Scanner(System.in);
        String fecha;
        int confirm = 0;
        do {
            System.out.println("Ingrese su fecha de nacimiento en formato DD-MM-AAAA y junto.");
            fecha = sc.next();
            sc.nextLine();
            System.out.printf("%s, ¿Correcto? 1 = si | 2 = no : ", fecha);
            confirm = sc.nextInt();
            sc.nextLine();
        } while (confirm != 1);
        return fecha;
    }
}
