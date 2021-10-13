/* Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras. */
import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
    String num;
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce el número: ");
    num = s.nextLine();

    s.close();

    System.out.println("La primera cifra es: " + num.charAt(0));
  }
}
