package jugador;

import equipo.Posicion;
import excepciones.EdadInvalidaException;

import java.util.Objects;


public class Deportista extends Persona {

    private Posicion posicion;
    private int dorsal;
    private double valorMercado;
    private boolean titular;

    public Deportista() {
    }


    public Deportista(String nombre, int edad, boolean activo, int salario, Posicion posicion, int dorsal, double valorMercado, boolean titular) {
        super(nombre, edad, activo, salario);

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }

        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }

        if (dorsal < 0) {
            throw new IllegalArgumentException("El dorsal no puede ser negativo");
        }

        if (valorMercado < 0) {
            throw new IllegalArgumentException("El valor de mercado no puede ser negativo");
        }

        this.nombre = nombre;
        this.edad = edad;
        this.activo = activo;
        this.salario = salario;
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

    public void setEdadConException(int edad) throws EdadInvalidaException {
        if (edad < 16 || edad > 40) throw new EdadInvalidaException("Edad inválida para deportista");
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