package Jugador;

public class arbitroVAR extends Arbitro {

    private boolean certificadoVAR;
    private int revisiones;
    private double precision;
    private String tecnologia;

    public arbitroVAR() {
    }

    public arbitroVAR(String nombre, int edad, boolean activo, double salario, int partidosDirigidos, boolean internacional, double puntuacion, String pais, boolean certificadoVAR, int revisiones, double precision, String tecnologia) {
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

    @Override
    public String toString() {
        return "Árbitro VAR: " + getNombre();
    }
}
