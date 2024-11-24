package classroom;

public class Grupo {

    public Persona[] estudiantes;
    public Persona profesor;
    public Asignatura asignatura;
    public int codigo;
    public String horario;

    Persona[] personas = new Persona[0];
                                        //Desde aquí ---------------------------------

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }
    

    public Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this(new Personas[cantidadEstudiantes], profesor, asignatura, codigo, horario);
        
    }

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
    }
                                            //Hasta aquí --------------------------------------------------

    void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
    
    void cambiarEstudiante(int indice, Persona estudiante) {
        estudiantes[indice] = estudiante;
    }
}
