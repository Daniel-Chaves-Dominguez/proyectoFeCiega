package Equipo;

import java.util.Objects;

public class Estadio extends Construccion {

    private int capacidad;
    private boolean techado;
    private double ingresos;

    public Estadio() {}

    public Estadio(String nombre, String ubicacion, double presupuestoAnual, boolean enServicio, int capacidad, boolean techado, double ingresos) {
        super(nombre, ubicacion, presupuestoAnual, enServicio);
        this.capacidad = capacidad;
        this.techado = techado;
        this.ingresos = ingresos;
    }

<<<<<<< HEAD
    public int getCapacidad() {
        return capacidad;
    }
=======
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public boolean isTechado() { return techado; }
    public void setTechado(boolean techado) { this.techado = techado; }
>>>>>>> 3572b61 (actualized)

    public double getIngresos() { return ingresos; }
    public void setIngresos(double ingresos) { this.ingresos = ingresos; }

    @Override
    public String toString() {
        return nombre + " (" + capacidad + " espectadores)";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Estadio)) return false;
        Estadio e = (Estadio) o;
        return Objects.equals(nombre, e.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 3572b61 (actualized)
