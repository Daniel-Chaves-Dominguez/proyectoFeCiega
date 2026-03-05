package tests;

import equipo.Equipo;
import equipo.Partido;
import equipo.FaseChampions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PartidoTest {

    @Test
    public void crearPartidoCorrectamente() {
        Equipo e1 = new Equipo("Madrid", 14, true, 1000000);
        Equipo e2 = new Equipo("Barca", 5, true, 900000);

        Partido p = new Partido(e1, e2, 2, 1, FaseChampions.GRUPOS);

        assertEquals(2, p.getGolesLocal());
    }

    @Test
    public void golesLocalNoNegativos() {
        Equipo e1 = new Equipo("Madrid", 14, true, 1000000);
        Equipo e2 = new Equipo("Barca", 5, true, 900000);

        assertThrows(IllegalArgumentException.class, () -> {
            new Partido(e1, e2, -1, 1, FaseChampions.GRUPOS);
        });
    }

    @Test
    public void golesVisitanteNoNegativos() {
        Equipo e1 = new Equipo("Madrid", 14, true, 1000000);
        Equipo e2 = new Equipo("Barca", 5, true, 900000);

        assertThrows(IllegalArgumentException.class, () -> {
            new Partido(e1, e2, 1, -2, FaseChampions.GRUPOS);
        });
    }

    @Test
    public void equiposNoPuedenSerIguales() {
        Equipo e1 = new Equipo("Madrid", 14, true, 1000000);

        assertThrows(IllegalArgumentException.class, () -> {
            new Partido(e1, e1, 1, 1, FaseChampions.GRUPOS);
        });
    }

    @Test
    public void equiposNoPuedenSerNulos() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Partido(null, null, 1, 1, FaseChampions.GRUPOS);
        });
    }
}