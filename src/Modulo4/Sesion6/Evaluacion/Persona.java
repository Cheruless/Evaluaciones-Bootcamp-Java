package Modulo4.Sesion6.Evaluacion;

public class Persona {
    private String usuario;
    private String password;
    private String nombreCompleto;
    private String fechaNacimiento;
    private boolean esMayor;

    public Persona() {
    }

    //SETTERS
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        if ((2024 - Integer.parseInt(fechaNacimiento.substring(6, 10)) >= 18))
            this.esMayor = true;
        else
            this.esMayor = false;
    }

    //GETTERS
    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public boolean isEsMayor() {
        return esMayor;
    }
}

