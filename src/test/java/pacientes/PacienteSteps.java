package pacientes;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PacienteSteps {

    private String nombre;
    private boolean registrado;

    @Dado("un nombre valido {string}")
    public void un_nombre_valido(String nombre) {
        this.nombre = nombre;
        assertTrue(nombre.length() > 0);
    }

    @Cuando("registro un paciente con ese nombre")
    public void registro_un_paciente_con_ese_nombre() {
        registrado = true; // simulacion
    }

    @Entonces("el sistema confirma el registro del paciente")
    public void el_sistema_confirma_el_registro_del_paciente() {
        assertTrue(registrado);
    }
}
