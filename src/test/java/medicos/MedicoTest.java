package medicos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MedicoTest {

    @Test
    void crearMedicoDebeAsignarNombre() {
        Medico m = new Medico("Carlos");
        assertEquals("Carlos", m.getNombre());
    }
}
