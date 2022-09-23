
package instituto.modelo.daos;

import instituto.modelo.dtos.AlumnoDTO;
import java.util.Collection;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public interface AlumnoDAO {
    public Collection<AlumnoDTO> obtenerAlumnos(int codCarrera);
}
