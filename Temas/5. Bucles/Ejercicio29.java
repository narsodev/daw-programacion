/* Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma. */
import java.util.Scanner;

public class Ejercicio29 {
  public static void main(String[] args) {
    int num;
    int divisor;
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el número: ");
    num = s.nextInt();

    System.out.print("Introduzca el divisor: ");
    divisor = s.nextInt();

    s.close();

    for (int i = num; i > 0; i--) {
      if (i % divisor != 0) System.out.println(i);
    }
  }
}
