/* Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo
o no.

  Ejemplo:
    Por favor, introduzca un número entero positivo: 17
    17 es primo
    18 no es primo
    19 es primo
    20 no es primo
    21 no es primo
*/
public class Ejercicio42 {
  public static void main(String[] args) {
    int num;
    boolean esPrimo;

    System.out.print("Por favor, introduzca un número entero positivo: ");
    num = Integer.parseInt(System.console().readLine());

    for (int i = num; i <= num + 5; i++) {
      esPrimo = true;
      for (int j = 2; j < Math.sqrt(num); j++) {
        if (i % j == 0) esPrimo = false;
      }
      System.out.printf("%d%ses primo\n", i, (esPrimo ? " " : " no "));
    }
  }
}
