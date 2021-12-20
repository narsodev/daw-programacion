/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante. */
public class Ejercicio12 {
  public static void main(String[] args) {
    int[] nums = new int[10];
    int[] arrayResultado = new int[10];

    int posicionInicial, posicionFinal;

    for (int i = 0; i < 10; i++) {
      nums[i] = (int) (Math.random() * 100);
      System.out.printf("%d: %d\n", i, nums[i]);
    }

    do {
      System.out.print("Introduzca la posición inicial (entre 0 y 8): ");
      posicionInicial = Integer.parseInt(System.console().readLine());
    } while (posicionInicial < 0 || posicionInicial > 8);

    do {
      System.out.printf("Introduzca la posición final (entre %d y 9): ", posicionInicial + 1);
      posicionFinal = Integer.parseInt(System.console().readLine());
    } while (posicionFinal <= posicionInicial || posicionFinal > 9);

    arrayResultado[posicionFinal] = nums[posicionInicial];

    for (int i = posicionInicial + 1; i < posicionFinal; i++) arrayResultado[i] = nums[i];

    arrayResultado[0] = nums[9];

    for (int i = posicionFinal; i < 9; i++) arrayResultado[i + 1] = nums[i];

    for (int i = 1; i <= posicionInicial; i++) arrayResultado[i] = nums[i - 1];

    for (int i = 0; i < 10; i++) System.out.printf("%d: %d\n", i, arrayResultado[i]);
  }
}