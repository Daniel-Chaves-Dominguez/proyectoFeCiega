package jugador;

import java.util.Objects;

public class ArbitroVAR extends Arbitro {

    private boolean certificadoVAR;
    private int revisiones;
    private double precision;
    private String tecnologia;

    public ArbitroVAR() {
    }

    public ArbitroVAR(String nombre, int edad, boolean activo, double salario, int partidosDirigidos, boolean internacional, double puntuacion, String pais, boolean certificadoVAR, int revisiones, double precision, String tecnologia) {
        super(nombre, edad, activo, salario, partidosDirigidos, internacional, puntuacion, pais);
        this.certificadoVAR = certificadoVAR;
        this.revisiones = revisiones;
        this.precision = precision;
        this.tecnologia = tecnologia;
    }

    public boolean isCertificadoVAR() {
        return certificadoVAR;
    }

    public void setCertificadoVAR(boolean certificadoVAR) {
        this.certificadoVAR = certificadoVAR;
    }

    public int getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(int revisiones) {
        this.revisiones = revisiones;
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String nivelExperiencia() {
        if (revisiones > 50) return "Muy experimentado";
        return "En formación";
    }

    @Override
    public String toString() {
        return "Árbitro VAR: " + getNombre() + " | Tecnología: " + tecnologia + " | Precisión: " + precision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArbitroVAR)) return false;
        if (!super.equals(o)) return false;
        ArbitroVAR that = (ArbitroVAR) o;
        return certificadoVAR == that.certificadoVAR &&
                revisiones == that.revisiones &&
                Double.compare(that.precision, precision) == 0 &&
                Objects.equals(tecnologia, that.tecnologia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), certificadoVAR, revisiones, precision, tecnologia);
    }
}