public class Ejercicio02 {
  public static void main(String[] args) throws Exception {
    String[][] pantalla = new String[23][60];
    String TEXTO = "FELICES FIESTAS";

    for (int fila = 0; fila < 23; fila++) {
      for (int columna = 0; columna < 60; columna++) {
        if (fila == 9 && columna >= 20 && columna < 20 + TEXTO.length()) {
          pantalla[fila][columna] = String.valueOf(TEXTO.charAt(columna - 20));
        } else pantalla[fila][columna] = " ";
      }
    }

    while (true) {
      System.out.print("\033[H\033[2J");

      for (int fila = 0; fila < 23; fila++) {
        for (int columna = 0; columna < 60; columna++) {
          System.out.print(pantalla[fila][columna] + " ");
        }
        System.out.println();
      }

      for (int fila = 22; fila > 0; fila--) {
        for (int columna = 0; columna < 60; columna++) {
          if (fila == 9 && columna >= 20 && columna < 20 + TEXTO.length()) {
            pantalla[fila + 1][columna] = pantalla[fila - 1][columna];
          } else pantalla[fila][columna] = pantalla[fila - 1][columna];
        }
      }

      for (int columna = 0; columna < 60; columna++) {
        pantalla[0][columna] = (int) (Math.random() * 15) == 0 ? "*" : " ";
      }

      Thread.sleep(600);
    }
      
  }
}