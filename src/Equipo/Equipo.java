package Equipo;

import Jugador.Deportista;
import Jugador.Entrenador;
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
    private ArrayList<Entrenador> cuerpoTecnico;
    private ArrayList<String> patrocinadores;
    private HashMap<String, String> records;

    public Equipo() {
        this.jugadores = new ArrayList<>();
        this.jugadoresPorDorsal = new HashMap<>();
        this.cuerpoTecnico = new ArrayList<>();
        this.patrocinadores = new ArrayList<>();
        this.records = new HashMap<>();
    }

    public Equipo(String nombre, int titulos, boolean clasificado, double presupuesto) {
        this();
        this.nombre = nombre;
        this.titulos = titulos;
        this.clasificado = clasificado;
        this.presupuesto = presupuesto;
    }



    public void anhadirJugador(Deportista j) {
        jugadores.add(j);
        jugadoresPorDorsal.put(j.getDorsal(), j);
    }

    public void eliminarJugador(Deportista j) {
        jugadores.remove(j);
        jugadoresPorDorsal.remove(j.getDorsal());
    }

    public Deportista buscarJugador(int dorsal) {
        return jugadoresPorDorsal.get(dorsal);
    }


    public void mostrarPlantilla() {
        for (Deportista j : jugadores) {
            if (j != null) {
                System.out.println(j.getNombre() + " - Dorsal: " + j.getDorsal());
            }
        }
    }

    public void anhadirEntrenador(Entrenador e) {
        cuerpoTecnico.add(e);
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
    public ArrayList<Entrenador> getCuerpoTecnico() {
        return cuerpoTecnico;
    }
    public ArrayList<String> getPatrocinadores() {
        return patrocinadores;
    }
    public HashMap<String, String> getRecords() {
        return records;
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre + " | Títulos: " + titulos + " | Presupuesto: " + presupuesto + "€";
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