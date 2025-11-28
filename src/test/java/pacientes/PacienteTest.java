package pacientes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PacienteTest {

    @Test
    void crearPacienteDebeAsignarNombre() {
        Paciente p = new Paciente("Juan");
        assertEquals("Juan", p.getNombre());
    }
}
