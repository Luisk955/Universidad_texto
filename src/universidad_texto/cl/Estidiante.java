package universidad_texto.cl;

import java.time.LocalDate;

public class Estidiante extends Persona {

    private boolean becado;
    private LocalDate fechaIngreso;

    public Estidiante() {
        super();
    }

    public Estidiante(String identificacion, String nombre, LocalDate fechaNacimiento,
                      char genero, boolean becado, LocalDate fechaIngreso) {
        super(identificacion, nombre, fechaNacimiento, genero);
        this.becado = becado;
        this.fechaIngreso = fechaIngreso;
    }

    public boolean isBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return super.toString() // llama al constructor del padre
                +  "Estudiante{" +
                "becado=" + becado +
                ", fechaIngreso=" + fechaIngreso +
                "} " ;
    }
}
