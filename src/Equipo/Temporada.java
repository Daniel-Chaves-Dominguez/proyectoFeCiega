package Equipo;

import java.util.ArrayList;
import java.util.Objects;

public class Temporada {

    private String anho;
    private boolean finalizada;
    private double premios;
    private int partidosTotales;

    private ArrayList<Partido> partidos;

    public Temporada() {
        partidos = new ArrayList<>();
    }

    public Temporada(String anho, boolean finalizada, double premios, int partidosTotales) {
        this();
        this.anho = anho;
        this.finalizada = finalizada;
        this.premios = premios;
        this.partidosTotales = partidosTotales;
    }

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public double getPremios() {
        return premios;
    }

    public void setPremios(double premios) {
        this.premios = premios;
    }

    public int getPartidosTotales() {
        return partidosTotales;
    }

    public void setPartidosTotales(int partidosTotales) {
        this.partidosTotales = partidosTotales;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void anhadirPartido(Partido p) {
        partidos.add(p);
    }

    @Override
    public String toString() {
        return "Temporada " + anho;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Temporada)) return false;
        Temporada that = (Temporada) o;
        return Objects.equals(anho, that.anho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anho);
    }
}
