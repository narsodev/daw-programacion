/* Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo. */
public class Ejercicio05 {
  public static void main(String[] args) {
    int[][] array = new int[6][10];
    int filaMin = 0;
    int columnaMin = 0;
    int filaMax = 0;
    int columnaMax = 0;

    for (int fila = 0; fila < 6; fila++) {
      for (int columna = 0; columna < 10; columna++) {
        int num = (int) (Math.random() * 1001);
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
