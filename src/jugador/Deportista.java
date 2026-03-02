package jugador;

import equipo.Posicion;
import excepciones.EdadInvalidaExcepcion;

import java.util.Objects;


public class Deportista extends Persona {

    private Posicion posicion;
    private int dorsal;
    private double valorMercado;
    private boolean titular;

    public Deportista() {
    }

    public Deportista (String nombre, int edad, boolean activo, double salario, Posicion posicion, int dorsal, double valorMercado, boolean titular) {
        super(nombre, edad, activo, salario);
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.valorMercado = valorMercado;
        this.titular = titular;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    public String estadoTitular() {
        if (titular) return "Titular";
        return "Suplente";
    }

    public void setEdadConExcepcion(int edad) throws EdadInvalidaExcepcion {
        if (edad < 16 || edad > 40) throw new EdadInvalidaExcepcion("Edad inválida para deportista");
        super.setEdad(edad);
    }

    @Override
    public String toString() {
        return nombre + " (" + posicion + ") #" + dorsal + " | Edad: " + getEdad();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Deportista jugador = (Deportista) o;
        return dorsal == jugador.dorsal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dorsal);
    }
}