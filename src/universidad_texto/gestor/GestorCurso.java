package universidad_texto.gestor;

import universidad_texto.cl.*;

public class GestorCurso extends Gestor{

    public GestorCurso(){

    }

    public void registrarCurso(String codigo,String nombreCurso, int creditos){
        Curso tmpCurso;
        tmpCurso = new Curso(codigo,nombreCurso,creditos);
        cl.registrarCurso(tmpCurso);
    }

    public String[] listarCursos()
    {
        return cl.listarCursos();
    }
}
