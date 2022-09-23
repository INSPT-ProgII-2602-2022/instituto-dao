package instituto.modelo.daos.impl;

import instituto.modelo.daos.CarreraDAO;
import instituto.modelo.dtos.CarreraDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CarreraDAOHardCode implements CarreraDAO {

    private Collection<CarreraDTO> carreras;

    public CarreraDAOHardCode() {
        this.carreras = new ArrayList<>();
        cargarCarreras();
    }

    public Collection<CarreraDTO> obtenerCarreras() {
        return new ArrayList<>(this.carreras); // Lista copia
    }

    private void cargarCarreras() {
        carreras.add(new CarreraDTO(60, "Informática Aplicada (HC)"));
        carreras.add(new CarreraDTO(61, "Control Eléctrico y Accionamientos"));
        carreras.add(new CarreraDTO(62, "Mecánica, Automotores y Máquinas Térmicas"));
        carreras.add(new CarreraDTO(63, "Automatización y Robótica"));
        carreras.add(new CarreraDTO(64, "Electrónica"));
        carreras.add(new CarreraDTO(65, "Química y Química Aplicada"));
        carreras.add(new CarreraDTO(66, "Física y Física Aplicada"));
        carreras.add(new CarreraDTO(67, "Diseño Tecnológico"));
        carreras.add(new CarreraDTO(68, "Profesorado en Disciplinas Industriales"));
        carreras.add(new CarreraDTO(69, "Inglés e Inglés Técnico"));
        carreras.add(new CarreraDTO(70, "Matemática y Matemática Aplicada"));
    }

    @Override
    public CarreraDTO obtenerCarrera(int codCarrera) {
        Iterator<CarreraDTO> it = carreras.iterator();
        CarreraDTO found = null;
        while(it.hasNext() && found == null) {
            CarreraDTO aux = it.next();
            if (aux.getCodigo() == codCarrera) {
                found = aux;
            }
        }
        return found;
    }
}
