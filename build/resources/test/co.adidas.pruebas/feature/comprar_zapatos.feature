#language: es
  ## Author: Giovanni Gómez R. - giovannig.gomez@sqasa.co

  Característica: Yo como usuario
    Necesito comprar de zapatos
    Para validar su funcionalidad


  Escenario:
    Dado el usuario ingresa a la pagina web
    Cuando el usuario busca "zapatos de futbol hombre"
    Y clickea de futbol
    Entonces el usuario elige "Guayos Nemeziz .1 Terreno Firme Hombre Fútbol"
    Y elige la talla de "USH7/M8"
    Y se agrega al carrito de compra
    Y valida "¡AÑADIDO AL CARRITO CORRECTAMENTE!"