/* 
    POSICION_ROJO = 0;
    POSICION_VERDE = 1;
    POSICION_AMARILLO = 2;
    POSICION_AZUL = 3;
*/
public class EjercicioExtra_JuegoDeLaOca {
  public static void main(String[] args) throws Exception {
    final int[] POSICIONES_OCA_A_OCA = { 4, 8, 13, 17, 22, 26, 31, 35, 40, 44, 49, 53, 58, 62 };
    final String[] COLORES = { "rojo", "verde", "amarillo", "azul" };
    int[] tablero = new int [63];
    int[] posiciones = {0, 0, 0, 0};
    boolean juegoFuncionando = true;
    int ganador = 5;

    for (int i = 0; i < 63; i++) tablero[i] = 0;

    for (int i = 0; i < 63; i++) {
      System.out.println("------");
      System.out.print("| ");
      
      boolean esOcaAOcaImprimir = false;
      int contadorOcaAOca = 0;
      while (!esOcaAOcaImprimir && contadorOcaAOca < POSICIONES_OCA_A_OCA.length) {
        if (i == POSICIONES_OCA_A_OCA[contadorOcaAOca]) {
          esOcaAOcaImprimir = true;
          System.out.print("OCA");
        }
        contadorOcaAOca++;
      }

      if (!esOcaAOcaImprimir) System.out.printf("%-3d", i + 1);

      System.out.print(" |");
      for (int j = 0; j < 4; j++) {
        if (i == posiciones[j]) System.out.print(COLORES[j] + " ");
      }
      System.out.println();
    }

    System.out.println();

    do {
      for (int i = 0; i < 4; i++) {
        System.out.println("Turno del color " + COLORES[i]);
        System.out.print("Se lanza el dado: ");
        int dado = (int) (Math.random() * 6) + 1;
        posiciones[i] += dado;
        Thread.sleep(500);
        System.out.println(dado);
  
        boolean esOcaAOca = false;
        int contadorOcaAOca = 0;
        while (!esOcaAOca && contadorOcaAOca < POSICIONES_OCA_A_OCA.length) {
          if (posiciones[i] == POSICIONES_OCA_A_OCA[contadorOcaAOca]) {
            esOcaAOca = true;
            System.out.println("De oca a oca y tiro porque me toca!!");
            if (posiciones[i] == POSICIONES_OCA_A_OCA[POSICIONES_OCA_A_OCA.length - 1]) {
              juegoFuncionando = false;
              ganador = i;
          } else posiciones[i] = POSICIONES_OCA_A_OCA[contadorOcaAOca + 1];
          }
          contadorOcaAOca++;
        }
  
        System.out.print("ENTER para continuar.");
        System.console().readLine();
  
        for (int j = 0; j < 63; j++) {
          System.out.println("------");
          System.out.print("| ");
          
          boolean esOcaAOcaImprimir = false;
          int contadorOcaAOcaImprimir = 0;
          while (!esOcaAOcaImprimir && contadorOcaAOcaImprimir < POSICIONES_OCA_A_OCA.length) {
            if (j == POSICIONES_OCA_A_OCA[contadorOcaAOcaImprimir]) {
              esOcaAOcaImprimir = true;
              System.out.print("OCA");
            }
            contadorOcaAOcaImprimir++;
          }
    
          if (!esOcaAOcaImprimir) System.out.printf("%-3d", j + 1);
    
          System.out.print(" |");
          for (int k = 0; k < 4; k++) {
            if (j == posiciones[k]) System.out.print(COLORES[k] + " ");
          }
          System.out.println();
        }
  
        System.out.print("ENTER para continuar.");
        System.console().readLine();
      }
    } while (juegoFuncionando);


    System.out.printf("El juego ha terminado! Ha ganado el jugador %s.", COLORES[ganador]);

  }
}
