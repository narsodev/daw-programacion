/* Modifica el programa anterior de tal forma que no se repita ningún número en
el array. */
public class Ejercicio06 {
  public static void main(String[] args) {
    int[][] array = new int[6][10];
    int filaMin = 0;
    int columnaMin = 0;
    int filaMax = 0;
    int columnaMax = 0;

    for (int fila = 0; fila < 6; fila++) {
      for (int columna = 0; columna < 10; columna++) {
        int num;
        boolean repetido;
        do {
          repetido = false;
          num = (int) (Math.random() * 1001);
          for (int filaComprobacion = 0; filaComprobacion <= fila && !repetido; filaComprobacion++) {
            for (int columnaComprobacion = 0; columnaComprobacion < (fila == filaComprobacion ? columna : 10) && !repetido; columnaComprobacion++) {
              if (num == array[filaComprobacion][columnaComprobacion]) repetido = true;
            }
          }
        } while (repetido);

        array[fila][columna] = num;
        if (num < array[filaMin][columnaMin]) {
          filaMin = fila;
          columnaMin = columna;
        }
        if (num > array[filaMax][columnaMax]) {
          filaMax = fila;
          columnaMax = columna;
        }
        System.out.print(num + "\t");
      }
      System.out.println();
    }

    System.out.printf("\nMáximo: fila %d columna %d número %d\n", filaMax + 1, columnaMax + 1, array[filaMax][columnaMax]);
    System.out.printf("Mínimo: fila %d columna %d número %d\n", filaMin + 1, columnaMin + 1, array[filaMin][columnaMin]);
  }
}
