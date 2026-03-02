import equipo.*;
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

        // Crear temporada
        Temporada temporada = new Temporada("2024/25", false, 200_000_000, 125);
        Partido p1 = new Partido(madrid, city, 2, 1, faseChampions.SEMIFINAL);
        Partido p2 = new Partido(city, madrid, 3, 3, faseChampions.GRUPOS);
        temporada.anhadirPartido(p1);
        temporada.anhadirPartido(p2);


        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{ \"anho\": \"").append(temporada.getAnho()).append("\", ");
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
    }
}