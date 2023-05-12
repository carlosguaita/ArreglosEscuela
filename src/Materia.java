public class Materia {

    private String nombre;
    private String idmateria;

    public Materia(String nombre, String idmateria) {
        this.nombre = nombre;
        this.idmateria = idmateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(String idmateria) {
        this.idmateria = idmateria;
    }
}
