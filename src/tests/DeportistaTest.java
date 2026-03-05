package tests;

import jugador.Deportista;
import equipo.Posicion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeportistaTest {

    @Test
    public void crearDeportistaCorrectamente() {
        Deportista d = new Deportista("Ramos", 35, true, 2000, Posicion.DEFENSA, 4, 5000000, true);
        assertEquals("Ramos", d.getNombre());
    }

    @Test
    public void nombreNoPuedeSerNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Deportista(null, 30, true, 1000, Posicion.DEFENSA, 5, 2000000, true);
        });
    }

    @Test
    public void edadNoPuedeSerNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Deportista("Jugador", -5, true, 1000, Posicion.DEFENSA, 5, 2000000, true);
        });
    }

    @Test
    public void dorsalNoPuedeSerNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Deportista("Jugador", 25, true, 1000, Posicion.DEFENSA, -1, 2000000, true);
        });
    }

    @Test
    public void valorMercadoNoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Deportista("Jugador", 25, true, 1000, Posicion.DEFENSA, 5, -2000000, true);
        });
    }
}