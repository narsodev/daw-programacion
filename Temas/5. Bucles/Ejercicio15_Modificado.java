/* Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base sucesivas
al numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 2 elevado a 1, 3 elevado a 2, 4 elevado a 3, 5 elevado a 4
y 6 elevado a 5. */
import java.util.Scanner;

public class Ejercicio15_Modificado {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int base;
    int exponente;
    int resultado = 1;

    System.out.print("Base: ");
    base = s.nextInt();

    System.out.print("Exponente: ");
    exponente = s.nextInt();

    s.close();

    for (int i = 1; i <= exponente; i++) {
      resultado = 1;
      for (int j = 0; j < i; j++) {
        resultado *= base;
      }
      System.out.printf("%d ^ %d = %d\n", base, i, resultado);
      base++;
    }
  }
}
