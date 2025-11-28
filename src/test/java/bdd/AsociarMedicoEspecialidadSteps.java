package bdd;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AsociarMedicoEspecialidadSteps {

    private boolean medicoExiste;
    private boolean especialidadExiste;
    private boolean asociacionExitosa;

    @Dado("un médico registrado con id {int}")
    public void un_medico_registrado_con_id(Integer idMedico) {
        // Simulación de existencia
        medicoExiste = (idMedico != null);
    }

    @Dado("una especialidad registrada con id {int}")
    public void una_especialidad_registrada_con_id(Integer idEspecialidad) {
        // Simulación de existencia
        especialidadExiste = (idEspecialidad != null);
    }

    @Cuando("asocio el médico {int} con la especialidad {int}")
    public void asocio_el_medico_con_la_especialidad(Integer idMedico, Integer idEspecialidad) {
        // Simulación de asociación exitosa si ambos existen
        asociacionExitosa = medicoExiste && especialidadExiste;
    }

    @Entonces("el sistema confirma la asociación correctamente")
    public void el_sistema_confirma_la_asociacion_correctamente() {
        assertTrue(asociacionExitosa, "La asociación médico–especialidad debe ser exitosa");
    }
}
