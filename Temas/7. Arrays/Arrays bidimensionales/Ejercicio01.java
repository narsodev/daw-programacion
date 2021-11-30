/* Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura. */
public class Ejercicio01 {
  public static void main(String[] args) {
    int[][] array = new int[3][6];

    array[0][0] = 0;
    array[0][1] = 30;
    array[0][2] = 2;
    array[0][5] = 5;
    array[1][0] = 75;
    array[1][4] = 0;
    array[2][2] = -2;
    array[2][3] = 9;
    array[2][5] = 11;

    for (int[] fila: array) {
      for (int columna: fila) System.out.print(columna + " ");
      System.out.println();
    }
  }
}
