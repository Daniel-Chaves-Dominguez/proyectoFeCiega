package tests;

import equipo.Equipo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EquipoTest {

    @Test
    public void crearEquipoCorrectamente() {
        Equipo equipo = new Equipo("Sevilla", 3, true, 1000000);
        assertEquals("Sevilla", equipo.getNombre());
    }

    @Test
    public void nombreEquipoNoNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Equipo(null, 3, false, 1000000);
        });
    }

    @Test
    public void nombreEquipoNoVacio() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Equipo("", 3, false, 1000000);
        });
    }

    @Test
    public void titulosNoNegativos() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Equipo("Betis", -1, true, 1000000);
        });
    }

    @Test
    public void presupuestoNoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Equipo("Madrid", 5, false, -100);
        });
    }
}