/* Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo. */
import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int entrada;
    int nEntradas = 0;
    int mayorPar = 0;
    double mediaImpares = 0;
    int nImpares = 0;
    
    do {
      System.out.printf("Número %d: ", (nEntradas + 1));
      entrada = s.nextInt();

      if (entrada >= 0) {
        nEntradas++;

        if (entrada % 2 == 0) {
          if (entrada > mayorPar) mayorPar = entrada;
        } else {
          mediaImpares += entrada;
          nImpares++;
        }
      }
    } while (entrada >= 0);

    s.close();

    System.out.println();

    System.out.printf("Se han introducido %d números\n", nEntradas);

    System.out.println("El mayor de los pares es: " + mayorPar);

    mediaImpares /= nImpares;
    System.out.println("La media de los impares es: " + mediaImpares);
    
  }  
}
