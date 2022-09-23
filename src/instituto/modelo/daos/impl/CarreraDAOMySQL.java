
package instituto.modelo.daos.impl;

import instituto.modelo.Conexion;
import instituto.modelo.daos.CarreraDAO;
import instituto.modelo.dtos.CarreraDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class CarreraDAOMySQL implements CarreraDAO {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/instituto";
    private static final String USER = "root";
    private static final String PASS = "root";

    @Override
    public Collection<CarreraDTO> obtenerCarreras()  {
        Collection<CarreraDTO> carreras = new ArrayList<CarreraDTO>();
        try {
            Connection con = Conexion.getConexion(DRIVER, URL, USER, PASS);
            
            PreparedStatement ps = con.prepareStatement("SELECT * FROM carreras");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int cod = rs.getInt(1);
                String nom = rs.getString(2);
                CarreraDTO carrera = new CarreraDTO(cod, nom);
                carreras.add(carrera);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Error al obtener carreras", ex);
        }
        return carreras;
    }

    @Override
    public CarreraDTO obtenerCarrera(int codCarrera) {
        return null;
    }
    
}
