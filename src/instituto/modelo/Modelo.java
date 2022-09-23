package instituto.modelo;

import instituto.modelo.daos.AlumnoDAO;
import instituto.modelo.daos.CarreraDAO;
import instituto.modelo.dtos.CarreraDTO;
import instituto.modelo.dtos.AlumnoDTO;
import java.util.Collection;

public class Modelo {
    
    private CarreraDAO carreraDAO;
    private AlumnoDAO alumnoDAO;

    public Modelo(CarreraDAO carreraDAO, AlumnoDAO alumnoDAO) {
        this.carreraDAO = carreraDAO;
        this.alumnoDAO = alumnoDAO;
    }

    public Collection<CarreraDTO> obtenerCarreras() {
        return carreraDAO.obtenerCarreras();
    }
    
    public CarreraDTO obtenerCarrera(int codCarrera) {
        return carreraDAO.obtenerCarrera(codCarrera);
    }

    public Collection<AlumnoDTO> obtenerAlumnos(int codCarrera) {
        return alumnoDAO.obtenerAlumnos(codCarrera);
    }
}
