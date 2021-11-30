/* Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha. */
public class Ejercicio02 {
  public static void main(String[] args) {
    int[][] array = new int[4][5];
    int[] sumasColumnas = new int[5];
    int sumaTotal = 0;

    for (int i = 0; i < 5; i++) sumasColumnas[i] = 0;

    System.out.println();
    for (int fila = 0 ; fila < 4; fila++) {
      for (int columna = 0; columna < 5; columna++) {
        System.out.printf("Fila %d columna %d: ", fila, columna);
        int num = Integer.parseInt(System.console().readLine());
        array[fila][columna] = num;
        sumasColumnas[columna] += num;
        sumaTotal += num; 
      }
    }

    for (int fila = 0; fila < 4; fila++) {
      int sumaFila = 0;
      for (int columna = 0; columna < 5; columna++){
        System.out.print(array[fila][columna] + "\t");
        sumaFila += array[fila][columna];
      }
      System.out.println(sumaFila);
    }
    
    for (int i = 0; i < 5; i++) System.out.print(sumasColumnas[i] + "\t");
    System.out.print(sumaTotal);
  }
}