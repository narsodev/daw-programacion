/* Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes.
  Ejemplo:
    159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13
    ¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): 1
    159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13
*/
public class Ejercicio16 {
  public static void main(String[] args) {
    int[] nums = new int[20];
    int multiplo;

    for (int i = 0; i < 20; i++) {
      int num = (int) (Math.random() * 401);
      System.out.printf("%d ", num); 
      nums[i] = num;
    }

    System.out.print("\n¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): ");

    multiplo = System.console().readLine().equals("1") ? 5 : 7;

    for (int num: nums) {
      if (num % multiplo == 0) System.out.printf("[%d] ", num);
      else System.out.printf("%d ", num);
    }
    System.out.println();
  }
}
