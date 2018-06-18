# language: es
Característica: Uso de cucumber con lenguaje Gherkin en español
  Como programador
  Quiero escribir mis test en español
  Para aumentar la claridad de los mismos

  Escenario: pago de un abonaré desde la Sede Electrónica de Hacienda Local
    Dado que el usuario navega a la página de pago de abonarés
      Y  que el usuario introduce los siguientes datos el formulario de pago de abonarés
         | emisora  | sufijo | abonare    | dc | control | importe |
         | 12345678 | 500    | 1234567890 | 12 | 112233  | 100     |
    Cuando pulsa el botón pagar
    Entonces Debe ver el error "No existe el abonaré indicado"
