
package instituto.modelo.daos;

import instituto.modelo.dtos.CarreraDTO;
import java.util.Collection;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public interface CarreraDAO {
    public Collection<CarreraDTO> obtenerCarreras();
    public CarreraDTO obtenerCarrera(int codCarrera);    
}
