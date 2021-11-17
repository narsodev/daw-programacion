/* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario. */
public class Ejercicio10 {
  public static void main(String[] args) {
    int[] nums = new int[20];

    for (int i = 0; i < 20; i++) {
      int num = (int) (Math.random() * 101);
      nums[i] = num;

      System.out.printf("%d: %d\n", i + 1, num);
    }

    System.out.println();

    for (int i = 0; i < 20; i++) {
      int num = nums[i];

      if (num % 2 == 0) {
        for (int j = i; j > 0; j--) nums[j] = nums[j - 1];
        nums[0] = num;
      }
    }

    for (int i = 0; i < 20; i++) System.out.printf("%d: %d\n", i + 1, nums[i]);
  }  
}
