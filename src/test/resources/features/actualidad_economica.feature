#Autor: Lizeth Rios Epalza

Feature: Actualidad económica

  @run
  Scenario: Acceder y descargar reporte de actualidad económica
    Given que el usuario quiere acceder a la pagina de Actualidad Economica del Grupo Bancolombia
    When selecciona el reporte OPEP+ aumentará la oferta de petróleo en julio de 2021
    And descarga el informe
    Then deberia ver el informe generado en PDF