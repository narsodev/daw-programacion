/* Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
pierde. Si sale otro número, tiene que seguir tirando.
*/
public class Ejercicio31 {
  public static void main(String[] args) {
    int dinero, dado1, dado2, sumaDados;
    int tiradaAnterior = 0;
    boolean repitiendo = false;

    System.out.print("Introduzca la cantidad que desea apostar: ");
    dinero = Integer.parseInt(System.console().readLine());

    do {
      dado1 = (int) (Math.random() * 6) + 1;
      dado2 = (int) (Math.random() * 6) + 1;
  
      System.out.println("Dado 1: " + dado1);
      System.out.println("Dado 2: " + dado2);
  
      sumaDados = dado1 + dado2;

      if (!repitiendo) {
        switch (sumaDados) {
          case 7, 11:
            dinero *= 2;
            System.out.println("Has ganado.");
            break;
          case 2, 3, 12:
            dinero = 0;
            System.out.println("Has perdido.");
            break;
          default:
            repitiendo = true;
            System.out.println("Su tirada se repite.");
            tiradaAnterior = sumaDados;
        }
      } else {
        repitiendo = false;
        if (sumaDados == 7) {
          System.out.println("Has perdido.");
          dinero = 0;
        }
        else if (sumaDados == tiradaAnterior) {
          System.out.println("Ha sacado lo mismo que la primera vez.");
          dinero *= 2;
        }
        else {
          System.out.println("Su tirada se repite.");
          repitiendo = true;
        }
      }
    } while (repitiendo);

    System.out.printf("Su dinero ahora es: %d€\n", dinero);
  }
}
