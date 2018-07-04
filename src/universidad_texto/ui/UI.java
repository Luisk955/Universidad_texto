package universidad_texto.ui;

import universidad_texto.gestor.GestorCurso;
import universidad_texto.gestor.GestorGrupo;
import universidad_texto.gestor.GestorProfesor;

import java.io.*;
import java.time.LocalDate;

public class UI {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String args[]) throws java.io.IOException {
        int opcion = -1; //variable que almacena la opción que selecciona el usuario del menú.
        do {

            out.println("1. Registrar curso");
            out.println("2. Listar cursos");
            out.println("3. Registrar grupo");
            out.println("4. Listar grupos");
            out.println("5. Registrar profesor");
            out.println("6. Listar profesores");
            out.println("7. Registrar grupo texto");
            out.println("8. Listar grupo texto");
            out.println("9. Actualizar grupo texto");
            out.println("0. Salir");
            out.println("Digite la opcion");
            opcion = Integer.parseInt(in.readLine());
            procesarOpcion(opcion);

        } while (opcion != 0);
    }

    public static void procesarOpcion(int pOpcion) throws java.io.IOException {
        switch (pOpcion) {
            case 1:
                registrarCurso();
                break;
            case 2:
                listarCursos();
                break;
            case 3:
                registrarGrupo();
                break;
            case 4:
                listarGrupos();
                break;
            case 5:
                registrarProfesor();
                break;
            case 6:
                listarProfesores();
                break;
            case 7:
                registrarGrupoTexto();
                break;
            case 8:
                listarGruposTexto();
                break;
            case 9:
                actualizarGruposTexto();
                break;
            case 0:
                out.println("Gracias por usar el sistema");
            default: // el usuario ingresa un valor que no está dentro de las opciones del menú
                out.println("Opcion inválida");
                break;

        }
    }

    //Add local
    public static void registrarCurso() throws java.io.IOException {
        String nombre;
        String codigo;
        int creditos;
        out.println("Digite el código del curso");
        codigo = in.readLine();
        out.println("Digite el nombre del curso");
        nombre = in.readLine();
        out.println("Digite la cantidad de créditos del curso");
        creditos = Integer.parseInt(in.readLine());
        GestorCurso gestor = new GestorCurso();
        gestor.registrarCurso(codigo, nombre, creditos);
    }

    public static void registrarGrupo() throws java.io.IOException {
        String nombreGrupo;
        String nombreCurso;
        String codigoCurso;
        int creditos;
        out.println("Digite el nombre del grupo");
        nombreGrupo = in.readLine();
        out.println("Digite el código del curso");
        codigoCurso = in.readLine();
        out.println("Digite el nombre del curso");
        nombreCurso = in.readLine();
        out.println("Digite la cantidad de créditos del curso");
        creditos = Integer.parseInt(in.readLine());
        GestorGrupo gestor = new GestorGrupo();
        gestor.registrarGrupo(nombreGrupo, codigoCurso, nombreCurso, creditos);
    }

    public static void registrarProfesor() throws java.io.IOException {
        GestorProfesor gestor = new GestorProfesor();
        String identificacion;
        String nombre;
        LocalDate fechaNacimiento;
        char genero;
        String profesion;
        String titulo;
        int dia;
        int mes;
        int year;
        out.println("Digite la identificación del profesor");
        identificacion = in.readLine();
        out.println("Digite el nombre del profesor");
        nombre = in.readLine();
        out.println("Digite el día de la fecha de nacimiento del profesor");
        dia = Integer.parseInt(in.readLine());
        out.println("Digite el mes de la fecha de nacimiento del profesor");
        mes = Integer.parseInt(in.readLine());
        out.println("Digite el año de la fecha de nacimiento del profesor");
        year = Integer.parseInt(in.readLine());
        fechaNacimiento = LocalDate.of(year, mes, dia);
        out.println("Digite el género (M,F,O) del profesor");
        genero = in.readLine().charAt(0);
        out.println("Digite la profesión del profesor");
        profesion = in.readLine();
        out.println("Digite el título del profesor");
        titulo = in.readLine();
        gestor.registrarProfesor(identificacion, nombre, fechaNacimiento, genero,
                profesion, titulo);
    }

    public static void listarCursos() throws java.io.IOException {
        GestorCurso gestor = new GestorCurso();
        String[] data = gestor.listarCursos();
        for (String info : data) {
            out.println(info);
        }
    }

    public static void listarGrupos() throws java.io.IOException {
        GestorGrupo gestor = new GestorGrupo();
        String[] data = gestor.listarGrupos();
        for (String info : data) {
            out.println(info);
        }
    }

    public static void listarProfesores() throws java.io.IOException {
        GestorProfesor gestor = new GestorProfesor();
        String[] data = gestor.listarProfesores();
        for (String info : data) {
            out.println(info);
        }
    }
    //Add local

    //Persistencia txt
    public static void registrarGrupoTexto() throws IOException {
        String nombreGrupo;
        String nombreCurso;
        String codigoCurso;
        int creditos;
        out.println("Digite el nombre del grupo");
        nombreGrupo = in.readLine();
        out.println("Digite el código del curso");
        nombreCurso = in.readLine();
        out.println("Digite el nombre del curso");
        codigoCurso = in.readLine();
        out.println("Digite la cantidad de créditos del curso");
        creditos = Integer.parseInt(in.readLine());
        GestorGrupo gestor = new GestorGrupo();
        gestor.registrarGrupoTexto(nombreGrupo, codigoCurso, nombreCurso, creditos);
    }

    public static void listarGruposTexto() throws IOException {
        GestorGrupo gestor = new GestorGrupo();
        String[] data;
        data = gestor.listarGrupoTexto();
        for (String info : data) {
            out.println(info);
        }
    }

    public static void actualizarGruposTexto() throws java.io.IOException {
        String nombreGrupo;
        String nombreCurso;
        String codigoCurso;
        int creditos;
        out.println("Actualizar grupos");
        out.println("Digite el nombre del grupo");
        nombreGrupo = in.readLine();
        out.println("Digite el código del curso");
        codigoCurso = in.readLine();
        out.println("Digite el nombre del curso");
        nombreCurso = in.readLine();
        out.println("Digite la cantidad de créditos del curso");
        creditos = Integer.parseInt(in.readLine());
        GestorGrupo gestor = new GestorGrupo();
        gestor.actualizarGrupo(nombreGrupo, codigoCurso, nombreCurso, creditos);
    }
    //Persistencia txt

}
