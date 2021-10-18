/* Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 2 elevado a 1, 2 elevado a 2, 2 elevado a 3, 2 elevado a 4
y 2 elevado a 5. */
import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double base;
    int exponente;
    double resultado = 1;

    System.out.print("Base: ");
    base = s.nextDouble();

    System.out.print("Exponente: ");
    exponente = s.nextInt();

    s.close();

    for (int i = 1; i <= exponente; i++) {
      resultado = 1;
      for (int j = 0; j < i; j++) {
        resultado *= base;
      }
      System.out.printf("%.2f ^ %d = %.2f\n", base, i, resultado);
    }
  }
}
