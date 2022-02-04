public class OcaAOca {
  static final int TABLERO_SIZE = 63;
  static final int[] POSICIONES_OCA_A_OCA = { 5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59, 63 };
  static final String[] JUGADORES = { "rojo", "verde", "amarillo", "azul" };

  public static int comprobarSiEsOcaAOca(int posicion) {
    int siguienteOcaAOca = -1;
    int contadorOcaAOca = 0;
      while (siguienteOcaAOca == -1 && contadorOcaAOca < POSICIONES_OCA_A_OCA.length) {
        if (posicion == POSICIONES_OCA_A_OCA[contadorOcaAOca] && posicion != TABLERO_SIZE) {
          siguienteOcaAOca = POSICIONES_OCA_A_OCA[contadorOcaAOca + 1];
        } else contadorOcaAOca++;
      }
    return siguienteOcaAOca;
  }

  public static void imprimirTablero(int[] posicionesJugadores) {
    for (int casilla = 0; casilla <= TABLERO_SIZE; casilla++) {
      System.out.println("------");
      System.out.print("| ");
      
      if (casilla == 0) System.out.print("SAL");
      else if (casilla == TABLERO_SIZE) System.out.print("FIN");
      else if (comprobarSiEsOcaAOca(casilla) != -1) System.out.print("OCA");
      else System.out.printf("%-3d", casilla);

      System.out.print(" |");
      for (int jugador = 0; jugador < 4; jugador++) {
        if (casilla == posicionesJugadores[jugador]) System.out.print(JUGADORES[jugador] + " ");
      }
      System.out.println();
    }

    System.out.println();
  }

  public static void main(String[] args) {
    int[] posicionesJugadores = { 0, 0, 0, 0 };
    int ganador = -1;

    imprimirTablero(posicionesJugadores);

    /* System.out.println("Quien saque mayor puntuación será el primero en salir. Si hay empate, se hará un desempate: ");
    do {

    } while (); */

    do {
      int jugador = 0;

      do {
        System.out.printf("Turno del color %s.\n", JUGADORES[jugador]);

        System.out.println("ENTER para lanzar el dado.");
        System.console().readLine();
        
        int dado = (int) (Math.random() * 6) + 1;
        System.out.println("Dado: " + dado);
        
        int posicionJugador = posicionesJugadores[jugador] + dado;

        if (posicionJugador > TABLERO_SIZE) {
          posicionJugador = 2 * TABLERO_SIZE - posicionJugador;
        }

        posicionesJugadores[jugador] = posicionJugador;
        
        System.out.print("ENTER para continuar.");
        System.console().readLine();
  
        imprimirTablero(posicionesJugadores);

        int siguienteOcaAOca = comprobarSiEsOcaAOca(posicionJugador);

        if (siguienteOcaAOca != -1) {
          if (posicionJugador != TABLERO_SIZE) {
            posicionesJugadores[jugador] = siguienteOcaAOca;

            System.out.println("De oca a oca y tiro porque me toca!!");
            System.out.print("ENTER para continuar.");
            System.console().readLine();
  
            imprimirTablero(posicionesJugadores);
          }
        }

        if (posicionJugador == TABLERO_SIZE) {
          ganador = jugador;
        } else if (siguienteOcaAOca == -1) jugador++;
      } while (jugador < 4 && ganador == -1);
    } while (ganador == -1);


    System.out.printf("El juego ha terminado! Ha ganado el jugador %s.", JUGADORES[ganador]);
  }
}

