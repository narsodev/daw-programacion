/* Escribe un programa que rellene un array de 15 elementos con números enteros
comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
array “cincuerizado”, según el siguiente criterio: si el número que hay en una
posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
siguiente múltiplo de 5 que exista a partir de él.
  Ejemplo:
    Array original:
    459 204 20 250 178 90 353 35 229 357 224 454 260 310 140
    Array cincuerizado:
    460 205 20 250 180 90 355 35 230 360 225 455 260 310 140
*/
public class Ejercicio21 {
  public static void main(String[] args) {
    int[] nums = new int[15];

    System.out.println("Array original:");
    for (int i = 0; i < 15; i++) {
      int num = (int) (Math.random() * 501);
      nums[i] = num;
      System.out.print(num + " ");
    }

    for (int i = 0; i < 15; i++) {
      int num = nums[i];
      if (num % 5 != 0) nums[i] = num + 5 - num % 5;
    }
    
    System.out.println("\nArray cincuerizado:");
    for (int num: nums) System.out.print(num + " ");
  }
}
