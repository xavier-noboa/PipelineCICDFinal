Feature: Gestión de Médicos

  Scenario: Registrar un médico correctamente
    Given un nombre de médico "Laura"
    When registro un médico con ese nombre
    Then el sistema confirma el registro del médico
