package universidad_texto.cl;

import java.util.ArrayList;

public class CapaLogica {
    private ArrayList<Grupo> grupos;
    private ArrayList<Curso> cursos;
    private ArrayList<Profesor> profesores;

    public CapaLogica(){
    }

    public void registrarProfesor(Profesor tmpProfesor){
        if(profesores == null){
            this.profesores = new ArrayList<>();
        }
        profesores.add(tmpProfesor);
    }
    public String[] listarProfesores(){
        String[] lista = new String[profesores.size()];
        int i = 0;
        for(Profesor tmpProfesor:profesores){
            lista[i] = tmpProfesor.toString();
            i++;
        }
        return lista;
    }

    public void registrarCurso(Curso tmpCurso){
        if(cursos == null) {
            cursos = new ArrayList<>();

        }
        cursos.add(tmpCurso);
    }

    public String[] listarCursos() {
        String[] lista = new String[cursos.size()];
        int i = 0;
        for(Curso tmpCurso:cursos){
            lista[i] = tmpCurso.toString();
            i++;
        }
        return lista;
    }

    public void registrarGrupo(Grupo tmpGrupo){
        if(grupos == null){
            grupos = new ArrayList<>();
        }
        grupos.add(tmpGrupo);
    }

    public String[] listarGrupos() {
        String[] lista = new String[grupos.size()];
        int i = 0;
        for(Grupo tmpGrupo:grupos){
            lista[i] = tmpGrupo.toString();
            i++;
        }
        return lista;
    }
}
