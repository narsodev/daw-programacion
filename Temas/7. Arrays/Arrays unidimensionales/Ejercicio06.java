/* Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array. */
public class Ejercicio06 {
  public static void main(String[] args) {
    int[] nums = new int[15];

    for (int i = 0; i < 15; i++) {
      System.out.print((i + 1) + ": ");
      nums[i] = Integer.parseInt(System.console().readLine());
    }

    System.out.println("Su array es:");
    for (int i = 0; i < 15; i++) System.out.printf("%d: %d\n", i + 1, nums[i]);

    System.out.println("Su array rotado es: ");
    
    int aux = nums[14];
    for (int i = 14; i > 0; i--) {
      nums[i] = nums[i - 1];
    }
    nums[0] = aux;

    for (int i = 0; i < 15; i++) System.out.printf("%d: %d\n", i + 1, nums[i]);
  }
}
