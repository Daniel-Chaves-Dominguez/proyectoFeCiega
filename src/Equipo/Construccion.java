package Equipo;

import java.util.Objects;

public class Construccion {

    protected String nombre;
    protected String ubicacion;
    protected double presupuestoAnual;
    protected boolean enServicio;

    public Construccion() {
    }

    public Construccion(String nombre, String ubicacion, double presupuestoAnual, boolean enServicio) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.presupuestoAnual = presupuestoAnual;
        this.enServicio = enServicio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public double getPresupuestoAnual() {
        return presupuestoAnual;
    }
    public void setPresupuestoAnual(double presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }

    public boolean isEnServicio() {
        return enServicio;
    }

    public void setEnServicio(boolean enServicio) {
        this.enServicio = enServicio;
    }

    @Override
    public String toString() {
        return nombre + " ubicado en " + ubicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Construccion)) return false;
        Construccion that = (Construccion) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(ubicacion, that.ubicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, ubicacion);
    }
}
