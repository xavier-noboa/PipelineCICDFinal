Feature: Gestión de Pacientes

  Scenario: Crear un paciente correctamente
    Given un nombre valido "Ana"
    When registro un paciente con ese nombre
    Then el sistema confirma el registro del paciente
