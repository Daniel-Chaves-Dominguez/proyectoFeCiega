package equipo;

import java.util.Objects;

public class Partido {

    private Equipo local;
    private Equipo visitante;
    private int golesLocal;
    private int golesVisitante;
    private faseChampions fase;

    public Partido() {}

    public Partido(Equipo local, Equipo visitante, int golesLocal, int golesVisitante, faseChampions fase) {
        this.local = local;
        this.visitante = visitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.fase = fase;
    }

    public Equipo getLocal() { return local; }
    public void setLocal(Equipo local) { this.local = local; }

    public Equipo getVisitante() { return visitante; }
    public void setVisitante(Equipo visitante) { this.visitante = visitante; }

    public int getGolesLocal() { return golesLocal; }
    public void setGolesLocal(int golesLocal) { this.golesLocal = golesLocal; }

    public int getGolesVisitante() { return golesVisitante; }
    public void setGolesVisitante(int golesVisitante) { this.golesVisitante = golesVisitante; }

    public faseChampions getFase() { return fase; }
    public void setFase(faseChampions fase) { this.fase = fase; }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Partido de " + fase + ": " + local + " " + golesLocal + " - " + golesVisitante + " " + visitante;
=======
        return local.getNombre() + " " + golesLocal + " - " + golesVisitante + " " + visitante.getNombre();
>>>>>>> 3572b61 (actualized)
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Partido)) return false;
        Partido p = (Partido) o;
        return Objects.equals(local, p.local) && Objects.equals(visitante, p.visitante) && fase == p.fase;
    }

    @Override
    public int hashCode() {
        return Objects.hash(local, visitante, fase);
    }
}
