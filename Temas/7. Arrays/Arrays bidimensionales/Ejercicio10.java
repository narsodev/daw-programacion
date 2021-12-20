// Realiza el juego de las tres en raya.
public class Ejercicio10 {
  public static void imprimirTablero(String[][] tablero) {
    for (String[] fila: tablero) {
      System.out.println("\n-----------");
      for (String casilla: fila) {
        System.out.printf("%3s", casilla);
      }
    }
    System.out.println("\n-----------");
  }
  public static void main(String[] args) throws Exception {
    final String ORDENADOR = "x";
    final String JUGADOR = "o";
    String ganador = "";
    String turno = ORDENADOR;
    int contador = 0;

    String[][] tablero = new String[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) tablero[i][j] = "";
    }

    while (ganador.equals("") && contador < 9) {
      int fila, columna;

      imprimirTablero(tablero);
      
      System.out.print("Turno del ");
      
      if (turno.equals(ORDENADOR)) {
        System.out.println("ordenador:");

        do {
          fila = (int) (Math.random() * 3);
          columna = (int) (Math.random() * 3);
        } while (!tablero[fila][columna].equals(""));
        
        System.out.print("Fila: ");
        Thread.sleep(1000);
        System.out.println(fila + 1);
      
        System.out.print("Columna: ");
        Thread.sleep(1000);
        System.out.println(columna + 1);
        
      } else {
        System.out.println("jugador. Elija una posición:");
        boolean repetir;

        do {
          System.out.print("Fila: ");
          fila = Integer.parseInt(System.console().readLine()) - 1;
          System.out.print("Columna: ");
          columna = Integer.parseInt(System.console().readLine()) - 1;

          if (fila >= 0 && fila <= 2 && columna >= 0 && columna <= 2) {
            repetir = !tablero[fila][columna].equals("");
          } else repetir = true;

          if (repetir) System.out.println("Posición no válida.");
        } while (repetir);
      }
      
      tablero[fila][columna] = turno;
      
      int[] comprobadores = new int[4];

      for (int i = 0; i < 3; i++) {
        if (tablero[i][columna].equals(turno)) comprobadores[0]++;
        else comprobadores[0] = -1; 

        if (tablero[fila][i].equals(turno)) comprobadores[1]++;
        else comprobadores[1] = -1;

        if (tablero[i][i].equals(turno)) comprobadores[2]++;
        else comprobadores[2] = -1;

        if (tablero[i][2 - i].equals(turno)) comprobadores[3]++;
        else comprobadores[3] = -1;
      }

      for (int i = 0; i < 4 && ganador.equals(""); i++) {
        if (comprobadores[i] == 3) ganador = turno;
      }
      
      turno = turno.equals(ORDENADOR) ? JUGADOR : ORDENADOR;

      contador++;
    }

    imprimirTablero(tablero);

    if (ganador.equals("")) System.out.println("Empate.");
    else System.out.printf("Enhorabuena, has ganado %s.", (ganador.equals(ORDENADOR) ? "ordenador" : "jugador"));
  }  
}
