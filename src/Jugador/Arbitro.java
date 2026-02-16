package Jugador;

import java.util.Objects;

public class Arbitro extends Persona {

    private int partidosDirigidos;
    private boolean internacional;
    private double puntuacion;
    private String pais;

    public Arbitro() {
    }

    public Arbitro(String nombre, int edad, boolean activo, double salario,
                   int partidosDirigidos, boolean internacional, double puntuacion, String pais) {
        super(nombre, edad, activo, salario);
        this.partidosDirigidos = partidosDirigidos;
        this.internacional = internacional;
        this.puntuacion = puntuacion;
        this.pais = pais;
    }

    public int getPartidosDirigidos() {
        return partidosDirigidos;
    }

    public void setPartidosDirigidos(int partidosDirigidos) {
        this.partidosDirigidos = partidosDirigidos;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Árbitro: " + this.getNombre();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Arbitro arbitro = (Arbitro) o;
        return Objects.equals(pais, arbitro.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pais);
    }
}
