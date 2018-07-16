# language: es
Característica: Uso de cucumber para testear un APIs
  Como Contribuyente
  Quiero acceder a las Entidades Bancarias de un Municipio
  Para saber dónde puedo hacer efectivo un pago

  Escenario: La API debe mostrar las Entidades Bancarias de una Entidad
    Dado que filtro en las Entidades Bancarias del Municipio 'BENAMEJI'
    Cuando invoco al API de Entidades Bancarias de un Municipio
    Entonces debo obtener una Entidad Bancaria con código CSB '0237'
