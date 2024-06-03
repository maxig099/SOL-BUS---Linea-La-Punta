package entidades;

public class Pasajeros {

    private int idPasajero;
    private String Nombre;
    private String Apellido;
    private String dni;
    private String correo;
    private String telefono;
    private boolean estado;

    public Pasajeros(int idPasajero, String Nombre, String Apellido, String dni, String correo, String telefono, boolean estado) {
        this.idPasajero = idPasajero;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Pasajeros(String Nombre, String Apellido, String dni, String correo, String telefono, boolean estado) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Pasajeros() {
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pasajero: " + "ID Pasajero= " + idPasajero + ", Nombre= " + Nombre + ", Apellido= " + Apellido + ", DNI= " + dni + ", Correo= " + correo + ", Telefono= " + telefono + ", Estado= " + estado;
    }

}
