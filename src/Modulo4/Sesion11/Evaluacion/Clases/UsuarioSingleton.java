package Modulo4.Sesion11.Evaluacion.Clases;

public class UsuarioSingleton{
    private static UsuarioSingleton instance;
    private String nombre;
    private String apellido;

    private UsuarioSingleton (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public static UsuarioSingleton getInstance(String nombre, String apellido){
        if(instance == null){
            instance = new UsuarioSingleton(nombre, apellido);
            System.out.printf("Creando usuario %s %s . . .\n", nombre, apellido);
        }
        System.out.printf("Bienvenido a Video Club Nostalgia, %s %s\n", instance.nombre, instance.apellido);
        return instance;
    }
}
