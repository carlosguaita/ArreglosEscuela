import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private String nombre;
    private String cedula;

    private List<Materia> listadoMaterias = new ArrayList<>();

    public Estudiante(String nombre, String cedula) {

        this.nombre = nombre;
        this.cedula = cedula;
    }

    public void agregarMateria(Materia materia){
        listadoMaterias.add(materia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public List<Materia> getListadoMaterias() {
        return listadoMaterias;
    }
}
