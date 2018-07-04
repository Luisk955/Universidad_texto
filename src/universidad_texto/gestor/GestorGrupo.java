package universidad_texto.gestor;

import java.io.IOException;
import universidad_texto.cl.*;
import java.util.ArrayList;
import universidad_texto.dao.CapaLogicaText;

public class GestorGrupo extends Gestor {

    public GestorGrupo() {

    }

    public void registrarGrupo(String nombreGrupo, String codigo, String nombreCurso, int creditos) {
        Curso tmpCurso;
        Grupo tmpGrupo;
        tmpCurso = new Curso(codigo, nombreCurso, creditos);
        tmpGrupo = new Grupo(nombreGrupo, tmpCurso);
        cl.registrarGrupo(tmpGrupo);
    }

    public String[] listarGrupos() {
        return cl.listarGrupos();
    }

    public void registrarGrupoTexto(String nombreGrupo, String codigo,
            String nombreCurso, int creditos) {
        Curso tmpCurso;
        Grupo tmpGrupo;
        tmpCurso = new Curso(codigo, nombreCurso, creditos);
        tmpGrupo = new Grupo(nombreGrupo, tmpCurso);
        CapaLogicaText logica = new CapaLogicaText();
        logica.registrarGrupo(tmpGrupo);
    }

    public String[] listarGrupoTexto() throws IOException {
        String[] datos;
        int i = 0;
        CapaLogicaText logica = new CapaLogicaText();
        Curso tmpCurso;
        Grupo tmpGrupo;
        ArrayList<Grupo> lista = logica.listarGrupos();
        datos = new String[lista.size()];
        for (Grupo miGrupo : lista) {
            datos[i] = miGrupo.toString();
            i++;
        }
        return datos;
    }

    public void actualizarGrupo(String nombreGrupo, String codigo, String nombreCurso, int creditos) throws IOException {
        Curso tmpCurso;
        Grupo tmpGrupo;
        tmpCurso = new Curso(codigo, nombreCurso, creditos);
        tmpGrupo = new Grupo(nombreGrupo, tmpCurso);
        CapaLogicaText logica = new CapaLogicaText();
        logica.actualizarGrupo(tmpGrupo);
    }
}
