package classroom;

public class Persona {

    long cedula = 1;
    String nombre;
    static int totalPersonas;
    
    //static {
    //    Persona.totalPersonas = Persona.totalPersonas + 1;
    //}
                        //------------------------------------------------
    public Persona(){
        this.cedula = 0;
        this.nombre = null;
        totalPersonas++;
    }
    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = 1;
        totalPersonas++;
    }
                                //----------------------------------------------------
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
