package medicos;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MedicoSteps {

    private String nombre;
    private boolean registrado;

    @Dado("un nombre de médico {string}")
    public void un_nombre_de_medico(String nombre) {
        this.nombre = nombre;
        assertTrue(nombre.length() > 0);
    }

    @Cuando("registro un médico con ese nombre")
    public void registro_un_medico_con_ese_nombre() {
        registrado = true; // simulación
    }

    @Entonces("el sistema confirma el registro del médico")
    public void el_sistema_confirma_el_registro_del_medico() {
        assertTrue(registrado);
    }
}
