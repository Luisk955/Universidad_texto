package universidad_texto.dao;

import java.io.*;
import static java.lang.System.console;
import java.util.ArrayList;
import universidad_texto.cl.Curso;
import universidad_texto.cl.Grupo;

public class CapaLogicaText {

    private static final String USR_FILE_NAME = "Grupos.txt";

    public void registrarGrupo(Grupo dato) {
        try {
            FileWriter writer = new FileWriter(USR_FILE_NAME, true);
            BufferedWriter buffer = new BufferedWriter(writer);

            buffer.write(dato.toString());
            buffer.newLine();
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Grupo> listarGrupos() throws IOException {
        ArrayList<Grupo> lista = new ArrayList<>();
        try {
            FileReader reader = new FileReader(USR_FILE_NAME);
            BufferedReader buffer = new BufferedReader(reader);
            String datos;

            while ((datos = buffer.readLine()) != null) {
                String data[];
                data = datos.split(",");
                Curso tmpCurso;
                Grupo tmpGrupo;
                tmpCurso = new Curso(data[2], data[3], Integer.parseInt(data[4]));
                tmpGrupo = new Grupo(data[1], tmpCurso);
                lista.add(tmpGrupo);
            }
            reader.close();
            return lista;
        } catch (IOException e) {
            throw e;
        }

    }

//    public ArrayList<Grupo> listarGrupos() throws IOException {
//        ArrayList<Grupo> lista = new ArrayList<>();
//        try {
//            FileReader reader = new FileReader(USR_FILE_NAME);
//            BufferedReader buffer = new BufferedReader(reader);
//            String datos;
//            while ((datos = buffer.readLine()) != null) {
//                String data[] = datos.split(",");
//                Curso tmpCurso;
//                Grupo tmpGrupo;
//                tmpCurso = new Curso(data[1], data[2], Integer.parseInt(data[3]));
//                tmpGrupo = new Grupo(data[0], tmpCurso);
//                lista.add(tmpGrupo);
//            }
//            reader.close();
//            return lista;
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw e;
//        }
//    }
    public void actualizarGrupo(Grupo tmpGrupo) throws IOException {
        ArrayList<Grupo> lista = listarGrupos();
        ArrayList<Grupo> tmpLista = new ArrayList<>();
        for (Grupo obj : lista) {
            if (obj.equals(tmpGrupo)) {
                actualizarArchivo(USR_FILE_NAME, obj.toString(), tmpGrupo.toString());
            }
        }
    }

    public void actualizarArchivo(String filePath, String datoViejo, String datoNuevo) throws IOException {
        File fileToBeModified = new File(filePath);
        String info = "";
        BufferedReader reader = null;
        FileWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
            while (line != null) {
                info = info + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newInfo = info.replaceAll(datoViejo, datoNuevo);
            writer = new FileWriter(fileToBeModified);
            writer.write(newInfo);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
