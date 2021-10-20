/* Escribe un programa que calcule el factorial de un número entero leído por
teclado. */
import java.util.Scanner;

public class Ejercicio28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;
    int factorial = 1;

    System.out.print("Introduzca el número: ");
    num = s.nextInt();

    s.close();

    for (int i = 2; i <= num; i++) {
      factorial *= i;
    }

    System.out.printf("%d! = %d\n", num, factorial);
  }
}
