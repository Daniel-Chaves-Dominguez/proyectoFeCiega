import Equipo.*;
import Jugador.*;
import excepciones.*;
import Interfaz.VentanaFormulario;
import util.JsonUtil;

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

        // Escribir JSON
        JsonUtil.escribirJson("temporada.json", String.valueOf(temporada));
    }
}