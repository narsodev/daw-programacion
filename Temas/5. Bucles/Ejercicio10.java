/* Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo. */
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    double entrada;
    int numEntradas = 0;
    double resultado = 0;
    Scanner s = new Scanner(System.in);   

    do {
      System.out.printf("Número %d: ", numEntradas + 1);
      entrada = s.nextDouble();
      if (entrada >= 0) {
        resultado += entrada;
        numEntradas++;
      }
    } while (entrada >= 0);

    s.close();

    resultado /= numEntradas;

    System.out.printf("La media es: %.2f", resultado);
  }
}
