# language: es
Característica: Uso de cucumber para testear un APIs
  Como Friki
  Quiero acceder al API de Rick and Morty
  Para hacer que el mundo del desarrollo de software sea un poco mejor

  Escenario: La API debe mostrar información sobre Rick Sanchez accediendo por el Id
    Dado que el ID del personaje es 1
    Cuando invoco al API de personajes de Rick y Morty por Id
    Entonces el API debe devolver un statusCode 200
      Y el API de personajes de Rick y Morty debe mostrar el nombre "Rick Sanchez"
      Y el API de personajes de Rick y Morty debe mostrar la especia "Human"

  Escenario: La API debe mostrar información sobre Morty Smith accediendo por el Id
    Dado que el ID del personaje es 2
    Cuando invoco al API de personajes de Rick y Morty por Id
    Entonces el API debe devolver un statusCode 200
      Y el API de personajes de Rick y Morty debe mostrar el nombre "Morty Smith"
      Y el API de personajes de Rick y Morty debe mostrar la especia "Human"

  Escenario: La API debe permitirme localizar personajes por nombre
    Dado que el nombre del personaje a buscar es "Rick"
    Cuando invoco al API de personajes de Rick y Morty filtrando por nombre
    Entonces el API debe devolver un statusCode 200
      Y el resultado debe contener 73 personajes

  Escenario: La API no debe mostrar ofrecer resultado cuando el nombre no exista
    Dado que el nombre del personaje a buscar es "Nombrequenoexiste"
    Cuando invoco al API de personajes de Rick y Morty filtrando por nombre
    Entonces el API debe devolver un statusCode 404
      Y el API debe arrojar el error "There is nothing here"

  Escenario: La API debe permitirme localizar personajes por nombre y estado
    Dado que el nombre del personaje a buscar es "Rick"
      Y que el estado del personaje a buscar es "alive"
    Cuando invoco al API de personajes de Rick y Morty filtrando por nombre
    Entonces el API debe devolver un statusCode 200
      Y el resultado debe contener 21 personajes
