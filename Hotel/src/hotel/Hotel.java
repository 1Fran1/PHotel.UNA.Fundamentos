
package hotel;

public class Hotel {
 
    String Pais;
    String Ubicacion;
    String Clasificacion;
    String Nombre;
    String Cabania;
    String RegistoDeClientes;
    
    
   public Hotel(){      
   }
   public Hotel(String Pais, String Ubicacion, String Clasificacion, String Nombre, String Cabania, String RegistroDeClientes){
     this.Pais  = Pais;
     this.Ubicacion = Ubicacion;
     this.Clasificacion = Clasificacion;
     this.Nombre = Nombre;
     this.Cabania = Cabania;
     this.RegistoDeClientes = RegistroDeClientes;    
   }       
    
    @Override
    public String toString() {
       return "====Hotel===\n" +
               "Pais=" + Pais +
               "\nUbicacion=" + Ubicacion + 
               "\nClasificacion=" + Clasificacion + 
               "\nNombre=" + Nombre + 
               "\nCabania=" + Cabania + 
               "\nRegistroDeClientes=" + RegistoDeClientes + "\n";
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCabania() {
        return Cabania;
    }

    public void setCabania(String Cabania) {
        this.Cabania = Cabania;
    }

    public String getRegistoDeClientes() {
        return RegistoDeClientes;
    }

    public void setRegistoDeClientes(String RegistoDeClientes) {
        this.RegistoDeClientes = RegistoDeClientes;
    }
    
    
   }