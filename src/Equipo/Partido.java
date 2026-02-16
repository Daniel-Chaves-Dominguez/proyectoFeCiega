package Equipo;

import Equipo.faseChampions;
import java.util.Objects;

public class Partido {

    private Equipo local;
    private Equipo visitante;
    private int golesLocal;
    private int golesVisitante;
    private faseChampions fase;

    public Partido() {
    }

    public Partido(Equipo local, Equipo visitante, int golesLocal, int golesVisitante, faseChampions fase) {
        this.local = local;
        this.visitante = visitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.fase = fase;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public faseChampions getFase() {
        return fase;
    }

    public void setFase(faseChampions fase) {
        this.fase = fase;
    }

    @Override
    public String toString() {
        return local + " " + golesLocal + " - " + golesVisitante + " " + visitante;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Partido)) return false;
        Partido partido = (Partido) o;
        return Objects.equals(local, partido.local)
                && Objects.equals(visitante, partido.visitante)
                && fase == partido.fase;
    }

    @Override
    public int hashCode() {
        return Objects.hash(local, visitante, fase);
    }
}
