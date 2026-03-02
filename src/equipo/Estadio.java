package equipo;

import java.util.Objects;

public class Estadio extends Construccion {

    private int capacidad;
    private boolean techado;
    private double ingresos;
    private String tipoCesped;

    public Estadio() {
    }

    public Estadio(String nombre, String ubicacion, double presupuestoAnual, boolean enServicio, int capacidad, boolean techado, double ingresos, String tipoCesped) {
        super(nombre, ubicacion, presupuestoAnual, enServicio);
        this.capacidad = capacidad;
        this.techado = techado;
        this.ingresos = ingresos;
        this.tipoCesped = tipoCesped;
    }


    public String getTipoCesped(){
        return tipoCesped;
    }

    public void setTipoCesped(String tipoCesped){
        this.tipoCesped = tipoCesped;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        return "Estadio{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", capacidad=" + capacidad +
                ", techado=" + techado +
                ", ingresos=" + ingresos +
                ", tipoCesped='" + tipoCesped + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estadio estadio = (Estadio) o;
        return Objects.equals(nombre, estadio.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}