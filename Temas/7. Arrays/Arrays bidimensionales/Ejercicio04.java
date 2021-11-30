/* Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números. */
public class Ejercicio04 {
  public static void main(String[] args) throws Exception {
    final int TIEMPO_DE_ESPERA = 400;
    int[][] array = new int[4][5];
    int[] sumasColumnas = new int[5];
    int sumaTotal = 0;

    for (int i = 0; i < 5; i++) sumasColumnas[i] = 0;

    System.out.println();
    for (int fila = 0 ; fila < 4; fila++) {
      for (int columna = 0; columna < 5; columna++) {
        int num = (int) (Math.random() * 900) + 100;
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

      Thread.sleep(TIEMPO_DE_ESPERA);
      System.out.println(sumaFila);
      Thread.sleep(TIEMPO_DE_ESPERA);
    }
    
    for (int i = 0; i < 5; i++) {
      Thread.sleep(TIEMPO_DE_ESPERA);
      System.out.print(sumasColumnas[i] + "\t");
    }
    Thread.sleep(TIEMPO_DE_ESPERA);
    System.out.print(sumaTotal);
  }  
}
