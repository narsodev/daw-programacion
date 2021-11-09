/* Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n). */
public class Ejercicio02 {
  public static void main(String[] args) {
    String carta, palo, numero;

    switch ((int) Math.random() * 4) {
      case 0:
        palo = "picas";
        break;
      case 1:
        palo = "corazones";
        break;
      case 2:
        palo = "diamantes";
        break;
      case 3:
        palo = "tréboles";
        break;
      default:
        palo = "";
    }

    numero = String.valueOf((int) (Math.random() * 13) + 1);

    switch (numero) {
      case "1":
        numero = "A";
        break;
      case "11":
        numero = "J";
        break;
      case "12":
        numero = "Q";
        break;
      case "13":
        numero = "K";
        break;
      default:
    }

    carta = numero + " de " + palo;

    System.out.println("Carta: " + carta);
  }
}
