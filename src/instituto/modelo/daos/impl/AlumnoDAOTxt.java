package instituto.modelo.daos.impl;

import instituto.modelo.daos.AlumnoDAO;
import instituto.modelo.dtos.AlumnoDTO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class AlumnoDAOTxt implements AlumnoDAO {
    
    private static final String PATH = "src/instituto/modelo/data/alumnos.txt";

    @Override
    public Collection<AlumnoDTO> obtenerAlumnos(int codCarrera) {
        Collection<AlumnoDTO> alumnos = new ArrayList<>();
        try ( BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            String renglon;
            while ((renglon = br.readLine()) != null) {
                if (Integer.parseInt(renglon) == codCarrera) {
                    AlumnoDTO alu = new AlumnoDTO();
                    renglon = br.readLine();
                    alu.setLegajo(Integer.parseInt(renglon));
                    renglon = br.readLine();
                    alu.setApellido(renglon);
                    renglon = br.readLine();
                    alu.setNombre(renglon);
                    renglon = br.readLine();
                    alumnos.add(alu);
                } else {
                    // Saltea 4 renglones hacia el próximo alumno
                    for (int i = 0; i < 4; i++) {
                        renglon = br.readLine();
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error de E/S", e);
        }
        return alumnos;
    }
}
