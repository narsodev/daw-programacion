/* Realiza un programa que muestre por pantalla un array de 10 filas por 10
columnas relleno con números aleatorios entre 200 y 300. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal. */

public class Ejercicio11 {
  public static void main(String[] args) {
    int[][] array = new int[10][10];
    int maximo = 200;
    int minimo = 300;
    int media = 0;

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        int num = (int) (Math.random() * 101) + 200;
        array[i][j] = num;
        System.out.printf("%d ", num);
      }
      System.out.println();
    }

    System.out.print("\n\nDiagonal: ");

    for (int i = 0; i < 10; i++) {
      int num = array[i][i];

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
