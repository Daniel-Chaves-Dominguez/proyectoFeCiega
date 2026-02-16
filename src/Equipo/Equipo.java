package Equipo;

import Jugador.Deportista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Equipo {

    private String nombre;
    private int titulos;
    private boolean clasificado;
    private double presupuesto;

    private ArrayList<Deportista> jugadores;
    private HashMap<Integer, Deportista> jugadoresPorDorsal;

    public Equipo() {
        jugadores = new ArrayList<>();
        jugadoresPorDorsal = new HashMap<>();
    }

    public Equipo(String nombre, int titulos, boolean clasificado, double presupuesto) {
        this();
        this.nombre = nombre;
        this.titulos = titulos;
        this.clasificado = clasificado;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public boolean isClasificado() {
        return clasificado;
    }

    public void setClasificado(boolean clasificado) {
        this.clasificado = clasificado;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ArrayList<Deportista> getJugadores() {
        return jugadores;
    }

    public void añadirJugador(Deportista j) {
        jugadores.add(j);
        jugadoresPorDorsal.put(j.getDorsal(), j);
    }

    public Deportista buscarJugador(int dorsal) {
        return jugadoresPorDorsal.get(dorsal);
    }

    public void eliminarJugador(Deportista j) {
        jugadores.remove(j);
        jugadoresPorDorsal.remove(j.getDorsal());
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Equipo)) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(nombre, equipo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}