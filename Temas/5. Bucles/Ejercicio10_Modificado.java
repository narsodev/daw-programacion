/* Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. Pregunta cuántos números introducirá el usuario.
Una vez sepa cuántos números, ignore los negativos */
import java.util.Scanner;

public class Ejercicio10_Modificado {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int nEntradas = 0;
    double entrada;
    double resultado = 0;

    System.out.print("¿Cuántos números introducirá? ");
    nEntradas = s.nextInt();
    
    for (int i = 0; i < nEntradas; i++) {
      do {
        System.out.printf("Número %d: ", i + 1);
        entrada = s.nextDouble();

        if (entrada < 0) System.out.println("Error. Solo se permiten números positivos.");

      } while (entrada < 0);

      resultado += entrada;
    }

    s.close();

    resultado /= nEntradas;

    System.out.printf("La media es: %.2f", resultado);
  }
}
