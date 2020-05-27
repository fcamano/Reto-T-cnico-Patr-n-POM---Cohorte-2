#Author: your.email@your.domain.com

@Regresion
Feature: Formulario treello
El usuario debe poder ingresar a la plataforma trello,
se debe poder crear un tablero exitosamente.


 @CasoExitoso
  Scenario: Diligenciamiento exitoso de acceso a trello,
            no se presenta ningun mensaje de validacion.
   Given autentico en trello con usuario  "fcamano@choucairtesting.com" y clave "Mayo_2020*"
    And  Ingreso a la funcionalidad trello
    When Diligencio la creacion de un tablero y validacion de nombre
   |Required|
   |tablero1|
    Then Verifico ingreso exitoso
    