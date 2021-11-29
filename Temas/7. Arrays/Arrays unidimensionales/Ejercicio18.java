/* Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
ambos incluidos y que los almacene en un array. A continuación, el programa
debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
mayor… Cuando se acaben los menores o los mayores, se completará con los
números que queden.
  Ejemplo 1:
    Array original:
    ┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
    │ Índice │ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │
    ├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
    │ Valor │ 127 │ 178 │ 11 │ 39 │ 121 │ 82 │ 130 │ 47 │ 128 │ 129 │
    └────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘
    Array resultado:
    ┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
    │ Índice │ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │
    ├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
    │ Valor │ 11 │ 127 │ 39 │ 178 │ 82 │ 121 │ 47 │ 130 │ 128 │ 129 │
    └────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘
*/
public class Ejercicio18 {
  public static void main(String[] args) {
    int[] nums = new int[10];

    for (int i = 0; i < 10; i++) {
      int num = (int) (Math.random() * 201);
      System.out.printf("%d: %d\n", i, num);
      nums[i] = num;
    }

    for (int i = 0; i < 10; i++) {
      boolean encontrado = false;
      int num = 0;

      int j = i;
      if (i % 2 == 0) {
        do {
          num = nums[j];
          if (num < 100) encontrado = true;
          else j++;
        } while (!encontrado && j < 10);
      }
      if (i % 2 != 0 || !encontrado) {
        j = i;
        do {
          num = nums[j];
          if (num >= 100) encontrado = true;
          else j++;
        } while (!encontrado && j < 10);
      }

      if (!encontrado) {
        j = i;
        do {
          num = nums[j];
          if (num < 100) encontrado = true;
          else j++;
        } while (!encontrado && j < 10);
      }

      nums[j] = nums[i];
      nums[i] = num;
    }

    System.out.println();
    for (int i = 0; i < 10; i++) {
      System.out.printf("%d: %d\n", i, nums[i]);
    }
  }
}