package instituto.modelo.dtos;

public class AlumnoDTO {

    private int legajo;
    private int codCarrera;
    private String apellido;
    private String nombre;
    
    public AlumnoDTO() {}

    public AlumnoDTO(int codCarrera, int legajo, String apellido, String nombre) {
        setLegajo(legajo);
        setCodCarrera(codCarrera);
        setApellido(apellido);
        setNombre(nombre);
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getCodCarrera() {
        return codCarrera;
    }

    public void setCodCarrera(int codCarrera) {
        this.codCarrera = codCarrera;
    }    
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
