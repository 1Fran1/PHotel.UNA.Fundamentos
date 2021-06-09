package hotel;

public class Cabanias extends Hotel {

    int Costo;
    String TipoHabitacion;
    String NombreCliente;
    int Identificacion;
    int Edad;

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    String Cadena = "Cabaña a alquilar\n"
            + "Nombre del Hotel : " + getNombre() + "\n"
            + "Pais del Hotel : " + getPais() + "\n"
            + "Ubicacion del Hotel: " + getUbicacion() + "\n"
            + "Clasifacion de la calidad : " + getClasificacion() + "\n"
            + "Costo de la cabaña : " + getCosto() + "\n"
            + "Tipo de habitacion : " + getTipoHabitacion() + "\n"
            + "Nombre del Cliente : " + getNombreCliente() + "\n"
            + "Identificacion : " + getIdentificacion() + "\n"
            + "Edad del Cliente: " + getEdad() + "\n";

    
    public Cabanias(int Costo, String TipoHabitacion, String NombreCliente, int Identificacion, int Edad) {
        this.Costo = Costo;
        this.TipoHabitacion = TipoHabitacion;
        this.NombreCliente = NombreCliente;
        this.Identificacion = Identificacion;
        this.Edad = Edad;
    }

    public Cabanias(int Costo, String TipoHabitacion, String NombreCliente, int Identificacion, int Edad, String Pais, String Ubicacion, String Clasificacion, String Nombre, String Cabania, String RegistroDeClientes) {
        super(Pais, Ubicacion, Clasificacion, Nombre, Cabania, RegistroDeClientes);
        this.Costo = Costo;
        this.TipoHabitacion = TipoHabitacion;
        this.NombreCliente = NombreCliente;
        this.Identificacion = Identificacion;
        this.Edad = Edad;
    }

}
