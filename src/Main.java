import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Luis","1235467");
        estudiante1.agregarMateria(new Materia("Algebra","MAT123"));
        estudiante1.agregarMateria(new Materia("Calculo 1","MAT2345"));
        estudiante1.agregarMateria(new Materia("Programacion II","ISW2345"));

        Estudiante estudiante2 = new Estudiante("Laura","654799");
        estudiante2.agregarMateria(new Materia("Calculo 2","MAT4324"));
        estudiante2.agregarMateria(new Materia("Inglés","LENG5453"));
        estudiante2.agregarMateria(new Materia("Programacion II","ISW2345"));

        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);

        //Profesor profesor1 = new Profesor("Alberto","354678");
        //profesor1.agregarEstudiantesMateria("Programacion II",listaEstudiantes);

        Profesor[] listaProfesores = new Profesor[5];

        listaProfesores[0] = new Profesor("Alberto","354678");
        listaProfesores[0].agregarEstudiantesMateria("Programacion II",listaEstudiantes);

        listaProfesores[1] = new Profesor("Juan","7756756");
        listaProfesores[1].agregarEstudiantesMateria("Programacion III",listaEstudiantes);

        String nombreMateria1 = listaProfesores[1].getAsignaciones()
                                                  .get("Programacion III")
                                                  .get(1)
                                                  .getListadoMaterias()
                                                  .get(1)
                                                  .getNombre();
        System.out.println("La materia 2 del estudiante 2 es profesor 2 es: "+nombreMateria1);

    }
}