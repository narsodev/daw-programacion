/* Define un array de 12 números enteros con nombre num y asigna los valores
según la tabla que se muestra a continuación. Muestra el contenido de todos
los elementos del array. ¿Qué sucede con los valores de los elementos que no
han sido inicializados? */
public class Ejercicio01 {
  public static void main(String[] args) {
    int[] nums = new int[12];

    nums[0] = 39;
    nums[1] = -2;
    nums[4] = 0;
    nums[6] = 14;
    nums[8] = 5;
    nums[9] = 120;

    for (int n: nums) System.out.print(n + " ");
  }
}
