/* 
    POSICION_ROJO = 0;
    POSICION_VERDE = 1;
    POSICION_AMARILLO = 2;
    POSICION_AZUL = 3;
*/
public class EjercicioExtra_JuegoDeLaOca {
  public static void main(String[] args) throws Exception {
    final int[] POSICIONES_OCA_A_OCA = { 4, 8, 13, 17, 22, 26, 31, 35, 40, 44, 49, 53, 58, 62 };
    final String[] JUGADORES = { "rojo", "verde", "amarillo", "azul" };
    int[] tablero = new int [63];
    int[] posicionesJugadores = { 0, 0, 0, 0 };
    boolean juegoFuncionando = true;
    int ganador = 5;

    for (int casilla = 0; casilla < 63; casilla++) tablero[casilla] = 0;

    for (int casilla = 0; casilla < 63; casilla++) {
      System.out.println("------");
      System.out.print("| ");
      
      boolean esOcaAOcaImprimir = false;
      int contadorOcaAOca = 0;
      while (!esOcaAOcaImprimir && contadorOcaAOca < POSICIONES_OCA_A_OCA.length) {
        if (casilla == POSICIONES_OCA_A_OCA[contadorOcaAOca]) {
          esOcaAOcaImprimir = true;
          System.out.print("OCA");
        }
        contadorOcaAOca++;
      }

      if (!esOcaAOcaImprimir) System.out.printf("%-3d", casilla + 1);

      System.out.print(" |");
      for (int jugadorImprimir = 0; jugadorImprimir < 4; jugadorImprimir++) {
        if (casilla == posicionesJugadores[jugadorImprimir]) System.out.print(JUGADORES[jugadorImprimir] + " ");
      }
      System.out.println();
    }

    System.out.println();

    do {
      for (int jugador = 0; jugador < 4; jugador++) {
        System.out.println("Turno del color " + JUGADORES[jugador]);
        System.out.print("Se lanza el dado: ");
        int dado = (int) (Math.random() * 6) + 1;
        posicionesJugadores[jugador] += dado;
        Thread.sleep(500);
        System.out.println(dado);
  
        boolean esOcaAOca = false;
        int contadorOcaAOca = 0;
        while (!esOcaAOca && contadorOcaAOca < POSICIONES_OCA_A_OCA.length) {
          if (posicionesJugadores[jugador] == POSICIONES_OCA_A_OCA[contadorOcaAOca]) {
            esOcaAOca = true;
            System.out.println("De oca a oca y tiro porque me toca!!");
            if (posicionesJugadores[jugador] == POSICIONES_OCA_A_OCA[POSICIONES_OCA_A_OCA.length - 1]) {
              juegoFuncionando = false;
              ganador = jugador;
          } else posicionesJugadores[jugador] = POSICIONES_OCA_A_OCA[contadorOcaAOca + 1];
          }
          contadorOcaAOca++;
        }
  
        System.out.print("ENTER para continuar.");
        System.console().readLine();
  
        for (int casilla = 0; casilla < 63; casilla++) {
          System.out.println("------");
          System.out.print("| ");
          
          boolean esOcaAOcaImprimir = false;
          int contadorOcaAOcaImprimir = 0;
          while (!esOcaAOcaImprimir && contadorOcaAOcaImprimir < POSICIONES_OCA_A_OCA.length) {
            if (casilla == POSICIONES_OCA_A_OCA[contadorOcaAOcaImprimir]) {
              esOcaAOcaImprimir = true;
              System.out.print("OCA");
            }
            contadorOcaAOcaImprimir++;
          }
    
          if (!esOcaAOcaImprimir) System.out.printf("%-3d", casilla + 1);
    
          System.out.print(" |");
          for (int jugadorImprimir = 0; jugadorImprimir < 4; jugadorImprimir++) {
            if (casilla == posicionesJugadores[jugadorImprimir]) System.out.print(JUGADORES[jugadorImprimir] + " ");
          }
          System.out.println();
        }
  
        System.out.print("ENTER para continuar.");
        System.console().readLine();
      }
    } while (juegoFuncionando);


    System.out.printf("El juego ha terminado! Ha ganado el jugador %s.", JUGADORES[ganador]);

  }
}
