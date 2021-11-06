/* Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
número es afortunado si contiene más números de la suerte que de la mala
suerte. Realiza un programa que diga si un número introducido por el usuario
es afortunado o no.
  Ejemplo 1:
    Introduzca un número: 772
    El 772 es un número afortunado.
*/
public class Ejercicio62 {
  public static void main(String[] args) {
    long num;
    int contadorSuerte = 0;
    int nCifras = 0;
    int digito;

    System.out.print("Introduzca un número: ");
    num = Long.parseLong(System.console().readLine());

    for (long i = num; i > 0; i /= 10) {
      digito = (int) (i % 10);
      if (digito == 3 || digito == 7 || digito == 8 || digito == 9) contadorSuerte++;

      nCifras++;
    }

    System.out.printf("El %d%s es un número afortunado.\n", num, (contadorSuerte > nCifras / 2) ? "" : " no");
  }
}
