/* Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado. */
import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    int numero;
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce el número: ");
    numero = s.nextInt();

    s.close();

    System.out.printf("%-4s %-6s %s\n", "Núm", "Cuadrado", "Cubo");
    for (int i = numero; i < numero + 5; i++) {
      System.out.printf("%-6d %-6d %d\n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
    }
  }
}
