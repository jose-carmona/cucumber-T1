# language: es
Característica: Uso de cucumber con lenguaje Gherkin en español
  Como programador
  Quiero escribir mis test en español
  Para aumentar la claridad de los mismos

  Escenario: El pago de un abonaré inexistente en la Sede Electrónica debe mostrar un mensaje de error
    Cuando navego a la página de pago de abonarés en la Sede Electrónica
      Y introduzco los siguientes datos en el formulario de pago de abonarés
         | emisora  | sufijo | abonare     | dc | control | importe |
         | 12345678 | 500    | 12345678901 | 12 | 112233  | 100     |
      Y pulso el botón pagar
    Entonces Debo ver el mensaje de error "No existe el abonaré indicado. Compruebe que la información introducida es correcta"
