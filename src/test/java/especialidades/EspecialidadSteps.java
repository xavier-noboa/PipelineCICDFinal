package especialidades;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EspecialidadSteps {

    private String nombre;
    private boolean registrada;

    @Dado("un nombre de especialidad {string}")
    public void un_nombre_de_especialidad(String nombre) {
        this.nombre = nombre;
        assertTrue(nombre.length() > 0);
    }

    @Cuando("registro una especialidad con ese nombre")
    public void registro_una_especialidad_con_ese_nombre() {
        registrada = true; // Simulación
    }

    @Entonces("el sistema confirma el registro de la especialidad")
    public void el_sistema_confirma_el_registro_de_la_especialidad() {
        assertTrue(registrada);
    }
}
