# language: es
Característica: Uso de cucumber para testear un APIs
  Como Friki
  Quiero acceder al API de Rick and Morty
  Para hacer que el mundo sea un poco mejor

  Escenario: La API debe mostrar información sobre Rick Sanchez
    Dado que el ID del personaje es 1
    Cuando invoco al API de personajes de Rick y Morty
    Entonces el API de personajes de Rick y Morty debe mostrar el nombre 'Rick Sanchez'
