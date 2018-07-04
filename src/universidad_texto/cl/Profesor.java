package universidad_texto.cl;
import java.util.ArrayList;
import java.time.LocalDate;

public class Profesor extends Persona {
    private String profesion;
    private String titulo;
    private ArrayList<Grupo> grupos;


    public Profesor() {
        super(); //llamando al constructor del padre.
    }

    public Profesor(String profesion, String titulo) {
        this.profesion = profesion;
        this.titulo = titulo;
    }

    public Profesor(String identificacion, String nombre, LocalDate fechaNacimiento,
                    char genero, String profesion, String titulo) {
        super(identificacion, nombre, fechaNacimiento, genero);
        this.profesion = profesion;
        this.titulo = titulo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Grupo> getGrupos(){
        return grupos;
    }

    @Override
    public String toString() {
        return super.toString()//llama al toSTring del padre
                +  "Profesor{" +
                "profesion='" + profesion + '\'' +
                ", titulo='" + titulo + '\'' +
                "} " ;
    }
}
