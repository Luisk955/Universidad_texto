package universidad_texto.cl;

import java.time.LocalDate;

public class Carrera {
    private String nombre;
    private String codigo;
    private LocalDate fechaCreacion;
    private boolean acreditada;

    public Carrera() {
    }

    public Carrera(String nombre, String codigo, LocalDate fechaCreacion,
                   boolean acreditada) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaCreacion = fechaCreacion;
        this.acreditada = acreditada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isAcreditada() {
        return acreditada;
    }

    public void setAcreditada(boolean acreditada) {
        this.acreditada = acreditada;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", acreditada=" + acreditada +
                '}';
    }
}
