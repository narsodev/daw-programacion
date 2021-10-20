/* Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media. */
import java.util.Scanner;

public class Ejercicio23 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int entrada;
    int nEntradas = 0;
    int suma = 0;

    do {
      System.out.printf("Entrada %d: ", nEntradas + 1);
      entrada = s.nextInt();
      suma += entrada;
      nEntradas++;
    } while (suma < 10000);

    s.close();

    System.out.println();

    if (suma > 10000) {
      System.out.println("Límite superado.");
      suma -= entrada;
      nEntradas--;
    }

    System.out.printf("Se han introducido %d entradas\n", nEntradas);
    System.out.println("El total acumulado es: " + suma);
    System.out.printf("La media es: %.2f", (suma / (double) nEntradas));
  }  
}
