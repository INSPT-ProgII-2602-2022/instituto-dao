package instituto.modelo.daos.impl;

import instituto.modelo.daos.CarreraDAO;
import instituto.modelo.dtos.CarreraDTO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class CarreraDAOTxt implements CarreraDAO {
    
    private static final String PATH = "src/instituto/modelo/data/carreras.txt";

    @Override
    public Collection<CarreraDTO> obtenerCarreras() {        
        Collection<CarreraDTO> carreras = new ArrayList<>();
        try ( BufferedReader br = new BufferedReader(new FileReader(PATH));) {
            String renglon;
            while ((renglon = br.readLine()) != null) {
                CarreraDTO ca = new CarreraDTO();
                ca.setCodigo(Integer.parseInt(renglon));
                renglon = br.readLine();
                ca.setNombre(renglon);
                renglon = br.readLine();
                carreras.add(ca);
            }
            
        } catch (IOException e) {
            throw new RuntimeException("Error de E/S", e);
        }
        return carreras;
    }

    @Override
    public CarreraDTO obtenerCarrera(int codCarrera) {
        CarreraDTO found = null;
        try ( BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            String renglon;
            while ((renglon = br.readLine()) != null && found == null) {
                if (Integer.parseInt(renglon) == codCarrera) {
                    found = new CarreraDTO();
                    found.setCodigo(Integer.parseInt(renglon));
                    renglon = br.readLine();
                    found.setNombre(renglon);
                } else {
                    // Saltea 2 renglones hacia la próxima carrera
                    for (int i = 0; i < 2; i++) {
                        renglon = br.readLine();
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error de E/S", e);
        }
        return found;
    }
}
