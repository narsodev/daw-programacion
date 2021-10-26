/* Realiza un conversor del sistema decimal al sistema de “palotes”.
Ejemplo:
Por favor, introduzca un número entero positivo: 47021
  El 47021 en decimal es el | | | | - | | | | | | | - - | | - |
  en el sistema de palotes.
*/
public class Ejercicio37 {
  public static void main(String[] args) {
    int num;
    int nCifras = 0;
    int base;
    int cifra;

    System.out.print("Introduzca un número entero positivo: ");
    num = Integer.parseInt(System.console().readLine());

    for (int i = num; i > 0; i /= 10) {
      nCifras++;
    }

    System.out.printf("El %d en decimal es el ", num);

    for (int i = 1; i <= nCifras; i++) {
      base = (int) Math.pow(10, nCifras - i);
      cifra = num / base;
      num -= cifra * base;

      for (int j = 0; j < cifra; j++) System.out.print("| ");

      if (i != nCifras) System.out.print("- ");
    }

    System.out.print("en el sistema de palotes.");
  }
}
