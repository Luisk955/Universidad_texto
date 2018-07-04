package universidad_texto.cl;

public class Grupo {

    private String nombre;
    private Curso cursoAsignado;

    public Grupo() {
    }

    public Grupo(String nombre, Curso tmpCurso) {

        this.nombre = nombre;
        this.cursoAsignado = tmpCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso getCursoAsignado() {
        return cursoAsignado;
    }

    public void setCursoAsignado(Curso tmpCurso) {
        this.cursoAsignado = tmpCurso;
    }

    @Override
    public String toString() {
        return "Grupo," + nombre + "," + cursoAsignado.toString();
    }

    @Override
    public boolean equals(Object grupo) {
        if (this == grupo) {
            return true;
        }
        if (grupo == null) {
            return false;
        }
        Grupo miGrupo = (Grupo) grupo;
        return this.getNombre().equals(miGrupo.getNombre());
    }
}
