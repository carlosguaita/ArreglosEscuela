import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profesor {

    private String nombre;
    private String cedula;

   private Map<String,List<Estudiante>> asignaciones = new HashMap<>();

    public Profesor(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public void agregarEstudiantesMateria(String nombreMateria, List<Estudiante> listaEstudiantes){
        asignaciones.put(nombreMateria,listaEstudiantes);
    }

    public Map<String, List<Estudiante>> getAsignaciones() {
        return asignaciones;
    }
}
