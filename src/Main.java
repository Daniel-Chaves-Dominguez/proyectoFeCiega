import equipo.*;
import excepciones.EdadInvalidaException;
import excepciones.PartidoInvalidoException;
import excepciones.PresupuestoInsuficienteException;
import excepciones.TemporadaFinalizadaException;
import jugador.*;
import interfaz.VentanaFormulario;
import util.JsonUtil;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {

        // Ventana formulario
        VentanaFormulario ventana = new VentanaFormulario();
        ventana.setVisible(true);

        // Crear equipos
        Equipo madrid = new Equipo("Real Madrid", 14, true, 800_000_000);
        Equipo city = new Equipo("Manchester City", 1, true, 900_000_000);

        // Crear jugadores
        Deportista j1 = new Deportista("Vinicius", 23, true, 2000,
                Posicion.DELANTERO, 7, 150_000_000, true);
        Deportista j2 = new Deportista("Haaland", 24, true, 3000,
                Posicion.DELANTERO, 9, 180_000_000, true);

        madrid.anhadirJugador(j1);
        city.anhadirJugador(j2);

        // Crear Entrenadores
        Entrenador e1 = new Entrenador("Carlo Ancelotti", 65, true, 50000, 25, true, 10000, "Defensivo");
        Entrenador e2 = new Entrenador("Pep Guardiola", 52, true, 60000, 20, true, 12000, "Posesión");

        // Crear Árbitros
        Arbitro a1 = new Arbitro("Antonio Mateu", 45, true, 5000, 100, true, 9.5, "España");
        Arbitro a2 = new Arbitro("Bjorn Kuipers", 50, true, 5500, 120, true, 9.7, "Países Bajos");

        // Crear Árbitros VAR
        ArbitroVAR var1 = new ArbitroVAR("Szymon Marciniak", 41, true, 5000, 110, true, 9.6, "Polonia", true, 60, 0.98, "VAR 2.0");
        ArbitroVAR var2 = new ArbitroVAR("Cüneyt Çakır", 45, true, 5200, 105, true, 9.4, "Turquía", true, 55, 0.97, "VAR 2.0");

        // Crear Estadios
        Estadio s1 = new Estadio("Santiago Bernabéu", "Madrid", 500_000_000, true, 81000, true, 120_000_000, "Césped natural");
        Estadio s2 = new Estadio("Camp Nou", "Barcelona", 400_000_000, true, 99000, false, 100_000_000, "Césped híbrido");

        try {
            if (madrid.getPresupuesto() < 100_000_000) {
                throw new PresupuestoInsuficienteException("Presupuesto insuficiente para fichajes");
            }
        } catch (PresupuestoInsuficienteException pie) {
            System.out.println("Excepción capturada: " + pie.getMessage());
        }

        try {
            Partido partidoInvalido = new Partido(madrid, city, -1, 2, FaseChampions.GRUPOS);
            if (partidoInvalido.getGolesLocal() < 0 || partidoInvalido.getGolesVisitante() < 0) {
                throw new PartidoInvalidoException("Goles no pueden ser negativos");
            }
        } catch (PartidoInvalidoException pie) {
            System.out.println("Excepción capturada: " + pie.getMessage());
        }


        // Crear temporada
        Temporada temporada = new Temporada("2024/25", false, 200_000_000, 125);
        Temporada temporada2 = new Temporada("2025/26", false, 250_000_000, 130);
        Partido p1 = new Partido(madrid, city, 2, 1, FaseChampions.SEMIFINAL);
        Partido p2 = new Partido(city, madrid, 3, 3, FaseChampions.GRUPOS);
        temporada.anhadirPartido(p1);
        temporada.anhadirPartido(p2);
        temporada2.anhadirPartido(p1);
        temporada2.anhadirPartido(p2);


        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{ \"año\": \"").append(temporada.getAnho()).append("\", ");
            sb.append("\"finalizada\": ").append(temporada.isFinalizada()).append(", ");
            sb.append("\"premios\": ").append(temporada.getPremios()).append(", ");
            sb.append("\"partidosTotales\": ").append(temporada.getPartidosTotales()).append(", ");
            sb.append("\"partidos\": [");

            for (Partido p : temporada.getPartidos()) {
                sb.append("{ \"local\": \"").append(p.getLocal().getNombre()).append("\", ");
                sb.append("\"visitante\": \"").append(p.getVisitante().getNombre()).append("\", ");
                sb.append("\"golesLocal\": ").append(p.getGolesLocal()).append(", ");
                sb.append("\"golesVisitante\": ").append(p.getGolesVisitante()).append(", ");
                sb.append("\"fase\": \"").append(p.getFase()).append("\" },");
            }
            if (!temporada.getPartidos().isEmpty()) sb.setLength(sb.length() - 1); // quitar última coma
            sb.append("] }");

            JsonUtil.escribirJson("temporada.json", sb.toString());

        } catch (IOException ioException) {
            System.out.println("Error guardando el archivo JSON");
        }

        try {
            Temporada t = new Temporada("2023/24", true, 100_000_000, 100);
            Partido partido = new Partido(madrid, city, 1, 0, FaseChampions.GRUPOS);
            t.anhadirPartido(partido);
        } catch (TemporadaFinalizadaException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        try {
            Deportista joven = new Deportista("Jugador Joven", 15, true, 1000, Posicion.DEFENSA, 12, 50000, false);
            joven.setEdadConException(15);
        } catch (EdadInvalidaException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}