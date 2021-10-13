/* Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos. */
import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
    String num;
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce el número: ");
    num = s.nextLine();

    s.close();

    System.out.printf("Este número tiene %d cifras.", num.length());
  
  }
}
