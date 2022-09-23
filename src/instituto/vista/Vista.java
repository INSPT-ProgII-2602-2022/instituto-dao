
package instituto.vista;

import instituto.modelo.dtos.AlumnoDTO;
import instituto.modelo.dtos.CarreraDTO;
import java.util.Collection;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public interface Vista {
    public abstract void iniciar();
    public abstract void mostrarCarreras(Collection<CarreraDTO> carreras);    
    public abstract void mostrarAlumnosDeCarrera(Collection<AlumnoDTO> alumnos, String nombreCarrera);
}
