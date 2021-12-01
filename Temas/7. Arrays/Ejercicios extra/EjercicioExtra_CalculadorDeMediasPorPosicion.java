public class EjercicioExtra_CalculadorDeMediasPorPosicion {
  public static void main(String[] args) {
    int[][] matriz = new int[6][6];
    
    System.out.println("Suavizador de matrices:\n\n");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        int num = (int) (Math.random() * 1000);
        System.out.print(num + "\t");
        matriz[i][j] = num;
      }
      System.out.println();
    }
    
    do {
      int[][] copiaMatriz = new int[matriz.length][matriz[0].length];
      for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[0].length; j++) copiaMatriz[i][j] = matriz[i][j];
      }

      System.out.print("\n\n");
  
      for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[0].length; j++) {
          int media = 0;
          int contador = 0;
          for (int k = i - 1; k <= i + 1; k++) {
            if (k >= 0 && k < matriz.length) {
              for (int h = j - 1; h <= j + 1; h++) {
                if (h >= 0 && h < matriz[0].length) {
                  contador++;
                  media += copiaMatriz[k][h];
                }
              }
            }
          }
          media /= contador;
          matriz[i][j] = media;
          System.out.print(media + "\t");
        }
        System.out.println();
      }

      System.out.print("\nIntroduzca \"no\" para salir: ");
    } while (!System.console().readLine().equals("no"));

  }
}
