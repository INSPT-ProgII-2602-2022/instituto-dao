package instituto;

import instituto.vista.VistaDeConsola;
import instituto.modelo.Modelo;
import instituto.modelo.daos.impl.AlumnoDAOHardCode;
import instituto.modelo.daos.impl.AlumnoDAOTxt;
import instituto.modelo.daos.impl.CarreraDAOHardCode;
import instituto.modelo.daos.impl.CarreraDAOTxt;
import instituto.vista.Vista;

public class Principal {

    public static void main(String[] args) {
        
        /*
            ¿Cómo podemos cambiar de DAOs sin recompilar el código fuente?
        */
        
        Modelo m = new Modelo(new CarreraDAOHardCode(), new AlumnoDAOHardCode());
        Vista v = new VistaDeConsola(m);
        
        Controlador c = new Controlador(m, v);
        c.iniciar();
    }
}
