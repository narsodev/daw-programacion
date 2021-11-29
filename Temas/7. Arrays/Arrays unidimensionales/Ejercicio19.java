/* Realiza un programa que sea capaz de insertar un número en una posición
concreta de un array. En primer lugar, el programa generará un array de 12
números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
el programa preguntará por el número que se quiere insertar y por la posición
donde será insertado. Los números del array se desplazan a la derecha para
dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
siempre se perderá.
  Ejemplo 1:
    Array original:
    Índice 0 1 2 3 4 5 6 7 8 9 10 11
    Valor 5 82 0 131 113 200 134 44 48 134 68 151
    Introduzca el número que quiere insertar: 77
    Introduzca la posición donde lo quiere insertar (0 – 11): 6
    Array resultado:
    Índice 0 1 2 3 4 5 6 7 8 9 10 11
    Valor 5 82 0 131 113 200 77 134 44 48 134 68
*/
public class Ejercicio19 {
  public static void main(String[] args) {
    int[] nums = new int[12];
    int numeroAInsertar, posicion;

    System.out.println("Array original:");
    for (int i = 0; i < 10; i++) {
      int num = (int) (Math.random() * 201);
      nums[i] = num;
      System.out.printf("%d: %d\n", i, num);
    }

    System.out.println("Introduzca el número que quiere insertar: ");
    numeroAInsertar = Integer.parseInt(System.console().readLine());

    System.out.println("Introduzca la posición donde lo quiere insertar (0 - 11): ");
    posicion = Integer.parseInt(System.console().readLine());

    for (int i = 11; i > posicion; i--) nums[i] = nums[i - 1];

    nums[posicion] = numeroAInsertar;

    System.out.println("Array resultado:");
    for (int i = 0; i < 10; i++) System.out.printf("%d: %d\n", i, nums[i]);
  }
}
