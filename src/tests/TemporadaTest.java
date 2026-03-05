package tests;

import equipo.Temporada;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemporadaTest {

    @Test
    public void crearTemporadaCorrectamente() {
        Temporada t = new Temporada("2024/25", false, 1000000, 100);
        assertEquals("2024/25", t.getAnho());
    }

    @Test
    public void anhoNoPuedeSerNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Temporada(null, false, 1000000, 100);
        });
    }

    @Test
    public void premiosNoNegativos() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Temporada("2024/25", false, -1000, 100);
        });
    }

    @Test
    public void partidosTotalesNoNegativos() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Temporada("2024/25", false, 1000000, -5);
        });
    }

    @Test
    public void temporadaFinalizada() {
        Temporada t = new Temporada("2024/25", true, 1000000, 100);
        assertTrue(t.isFinalizada());
    }
}