package universidad_texto.gestor;

import universidad_texto.cl.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestorProfesor extends Gestor {

    public GestorProfesor() {

    }

    public void registrarProfesor(String identificacion, String nombre, LocalDate fechaNacimiento, char genero, String profesion, String titulo) {
        Profesor tmpProfesor;
        tmpProfesor = new Profesor(identificacion, nombre, fechaNacimiento, genero, profesion, titulo);
        cl.registrarProfesor(tmpProfesor);
    }

    public String[] listarProfesores() {
        return cl.listarProfesores();
    }

}
