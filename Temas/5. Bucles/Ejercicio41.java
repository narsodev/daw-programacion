/* Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.

  Ejemplo 1:
    Por favor, introduzca un número entero positivo: 406783
    El 406783 contiene 4 dígitos pares y 2 dígitos impares.

  Ejemplo 2:
    Por favor, introduzca un número entero positivo: 3177840
    El 3177840 contiene 3 dígitos pares y 4 dígitos impares.
*/
public class Ejercicio41 {
  public static void main(String[] args) {
    long num;
    int nPares = 0;
    int nImpares = 0;

    System.out.print("Por favor, introduzca un número entero positivo: ");
    num = Integer.parseInt(System.console().readLine());

    for (long i = num; i > 0; i /= 10) {
      if ((i % 10) % 2 == 0) nPares++;
      else nImpares++;
    }

    System.out.printf("El %d contiene %d dígitos pares y %d dígitos impares.", num, nPares, nImpares);
  }
}
