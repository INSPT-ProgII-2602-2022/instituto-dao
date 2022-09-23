package instituto.vista;

import instituto.modelo.dtos.AlumnoDTO;
import instituto.modelo.Modelo;
import instituto.modelo.dtos.CarreraDTO;
import java.util.Collection;
import java.util.Scanner;

public class VistaDeConsola implements Vista {

    private Modelo model;

    public VistaDeConsola(Modelo model) {
        this.model = model;
    }

    @Override
    public void iniciar() {
        Collection<CarreraDTO> carreras = model.obtenerCarreras(); 
        mostrarCarreras(carreras);
        System.out.print("Elija una carrera: ");
        int codCarrera = Integer.parseInt(new Scanner(System.in).nextLine());        
        Collection<AlumnoDTO> alumnos = model.obtenerAlumnos(codCarrera);
        CarreraDTO laCarrera = model.obtenerCarrera(codCarrera);
        mostrarAlumnosDeCarrera(alumnos, laCarrera.getNombre());
        
    }
    
    @Override
    public void mostrarCarreras(Collection<CarreraDTO> carreras) {
        System.out.println("*** CARRERAS ***");
        for (CarreraDTO ca : carreras) {
            System.out.println(ca.getCodigo() + " - " + ca.getNombre());
        }
    }
    
    @Override
    public void mostrarAlumnosDeCarrera(Collection<AlumnoDTO> alumnos, String nombreCarrera) {
        System.out.println("*** Alumnos de " + nombreCarrera + " ***");
        for (AlumnoDTO elem : alumnos) {
            System.out.println(elem.getLegajo() + " - " + elem.getApellido() + ", " + elem.getNombre());
        }
    }
}
