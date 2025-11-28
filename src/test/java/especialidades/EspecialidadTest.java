package especialidades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EspecialidadTest {

    @Test
    void crearEspecialidadDebeAsignarNombre() {
        Especialidad e = new Especialidad("Pediatría");
        assertEquals("Pediatría", e.getNombre());
    }
}
