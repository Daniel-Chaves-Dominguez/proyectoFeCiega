package Jugador;

import java.util.Objects;

public class Entrenador extends Persona {

    private int experiencia;
    private boolean principal;
    private double bonus;
    private String estiloJuego;

    public Entrenador() {
    }

    public Entrenador(String nombre, int edad, boolean activo, double salario,
                      int experiencia, boolean principal, double bonus, String estiloJuego) {
        super(nombre, edad, activo, salario);
        this.experiencia = experiencia;
        this.principal = principal;
        this.bonus = bonus;
        this.estiloJuego = estiloJuego;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public boolean isPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getEstiloJuego() {
        return estiloJuego;
    }

    public void setEstiloJuego(String estiloJuego) {
        this.estiloJuego = estiloJuego;
    }

    @Override
    public String toString() {
        return "Entrenador: " + nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Entrenador that = (Entrenador) o;
        return experiencia == that.experiencia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experiencia);
    }
}

