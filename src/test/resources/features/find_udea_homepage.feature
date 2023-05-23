# Author: Mateo Rivera
  # Language: EN

  Feature: Consultar la pagina principal de la U. de A.
    Como estudiante de la U. de A. necesito buscar homepage de la U en Google
    para ingresar al sitio oficial de la U. de A.

  Scenario: Buscar la pagina oficial de la U. de A. en el motor de busqueda de Google
    Given que me encuentro en la pagina principal de Google
    When escriba la palabra U. de A.
    Then puedo ver el link de la pagina oficial