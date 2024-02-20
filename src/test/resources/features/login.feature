Feature: Practica01

  Scenario: Validar login de Usuario
    Given Usuario administrador
    When ingreso mis crecenciales:
      | usuario                   | Clave        |
      | quevedo.edinson@gmail.com | P@ssw0rd86   |
      | corporosoft@gmail.com     | P@ssw0rd1986 |
    Then ingreso correctamente

