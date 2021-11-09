/* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as. */
public class Ejercicio03 {
  public static void main(String[] args) {
    String carta, palo, numero;

    switch ((int) Math.random() * 4) {
      case 0:
        palo = "bastos";
        break;
      case 1:
        palo = "espadas";
        break;
      case 2:
        palo = "copas";
        break;
      case 3:
        palo = "oros";
        break;
      default:
        palo = "";
    }

    numero = String.valueOf((int) (Math.random() * 10) + 1);

    switch (numero) {
      case "1":
        numero = "As";
        break;
      case "8":
        numero = "Sota";
        break;
      case "9":
        numero = "Caballo";
        break;
      case "10":
        numero = "Rey";
        break;
      default:
    }

    carta = numero + " de " + palo;

    System.out.println("Carta: " + carta);
  }  
}
