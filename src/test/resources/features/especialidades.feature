Feature: Gestión de Especialidades

  Scenario: Registrar una especialidad correctamente
    Given un nombre de especialidad "Dermatología"
    When registro una especialidad con ese nombre
    Then el sistema confirma el registro de la especialidad
