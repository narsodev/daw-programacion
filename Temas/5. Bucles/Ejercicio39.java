/* Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los números desde el 1 al número introducido junto
con su factorial.
Ejemplo:
  Por favor, introduzca un número entero positivo: 7
  1! = 1
  2! = 2
  3! = 6
  4! = 24
  5! = 120
  6! = 720
  7! = 5040
*/
public class Ejercicio39 {
  public static void main(String[] args) {
    int num;
    int resultado;

    System.out.print("Por favor, introduzca un número entero positivo: ");
    num = Integer.parseInt(System.console().readLine());

    for (int i = 1; i <= num; i++) {
      resultado = 1;
      for (int j = 1; j <= i; j++) resultado *= j;
      System.out.printf("%d! %d\n", i, resultado);
    }
  }
}
