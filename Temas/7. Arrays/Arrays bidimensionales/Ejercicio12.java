/* Realiza un programa que muestre por pantalla un array de 9 filas por 9
columnas relleno con números aleatorios entre 500 y 900. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal. */
public class Ejercicio12 {
  public static void main(String[] args) {
    int[][] array = new int[9][9];
    int maximo = 500;
    int minimo = 900;
    int media = 0;

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        int num = (int) (Math.random() * 401) + 500;
        array[i][j] = num;
        System.out.printf("%d ", num);
      }
      System.out.println();
    }

    System.out.print("\n\nDiagonal: ");

    for (int i = 0; i < 9; i++) {
      int num = array[8 - i][i];

      if (num > maximo) maximo = num;
      if (num < minimo) minimo = num;
      media += num;

      System.out.print(num + " ");
    }

    media /= 10;

    System.out.printf("\nMáximo: %d\n", maximo);
    System.out.printf("Mínimo: %d\n", minimo);
    System.out.printf("Media: %d\n", media);

  }  
}
