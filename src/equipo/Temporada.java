package equipo;

import excepciones.TemporadaFinalizadaException;

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
        if (anho == null || anho.isEmpty()) throw new IllegalArgumentException("Año no puede ser nulo o vacío");
        if (premios < 0) throw new IllegalArgumentException("Premios no pueden ser negativos");
        if (partidosTotales < 0) throw new IllegalArgumentException("Partidos totales no pueden ser negativos");

        this.anho = anho;
        this.finalizada = finalizada;
        this.premios = premios;
        this.partidosTotales = partidosTotales;
        this.partidos = new ArrayList<>();
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

    public void anhadirPartido(Partido p) throws TemporadaFinalizadaException {
        if (finalizada) throw new TemporadaFinalizadaException("No se pueden añadir partidos a una temporada finalizada");
        partidos.add(p);
    }

    public void eliminarPartido (Partido p) {
        partidos.remove(p);
    }

    public void mostrarPartidos() {
        for (Partido p : partidos) {
            System.out.println(p);
        }
    }

    public Partido buscarPartidoPorEquipos(Equipo local, Equipo visitante) {
        for (Partido p : partidos) {
            if (p.getLocal().equals(local) && p.getVisitante().equals(visitante)) {
                return p;
            }
        }
        return null;
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
