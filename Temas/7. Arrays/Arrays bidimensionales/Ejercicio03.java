/* Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999). */
public class Ejercicio03 {
  public static void main(String[] args) {
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
      System.out.println(sumaFila);
    }
    
    for (int i = 0; i < 5; i++) System.out.print(sumasColumnas[i] + "\t");
    System.out.print(sumaTotal);
  }  
}
