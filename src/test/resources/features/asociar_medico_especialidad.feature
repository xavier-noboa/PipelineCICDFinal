Feature: Asociación de Médico a Especialidad

  Scenario: Asociar médico a una especialidad existente
    Given un médico registrado con id 5
    And una especialidad registrada con id 2
    When asocio el médico 5 con la especialidad 2
    Then el sistema confirma la asociación correctamente
