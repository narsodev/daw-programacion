/* Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado. */
import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    String num;
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce el número: ");
    num = s.nextLine();

    s.close();

    System.out.println("La última cifra es: " + num.charAt(num.length() - 1));
  }
}
