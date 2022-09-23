
package instituto;

import instituto.modelo.Modelo;
import instituto.vista.Vista;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Controlador {
    private Modelo model;
    private Vista view;

    public Controlador(Modelo m, Vista v) {
        this.model = m;
        this.view = v;
    }
    
    public void iniciar() {
        view.iniciar();
    }
}
