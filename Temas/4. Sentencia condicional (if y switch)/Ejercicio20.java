/* Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras. */
import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
    String num;
    boolean capicua = false;
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce el número: ");
    num = s.nextLine();


    if (num.length() == 1) capicua = true;
    else if (num.length() == 2) {
      if (num.charAt(0) == num.charAt(1)) capicua = true;
    }
    else if (num.length() == 3) {
      if (num.charAt(0) == num.charAt(2)) capicua = true;
    }
    else if (num.length() == 4) {
      if (num.charAt(0) == num.charAt(3) && num.charAt(1) == num.charAt(2)) capicua = true;
    }
    else if (num.length() == 5) {
      if (num.charAt(0) == num.charAt(4) && num.charAt(1) == num.charAt(3)) capicua = true;
    }

    if (capicua) System.out.printf("El número %s es capicúa.", num);
    else System.out.printf("El número %s no es capicúa.", num);

    s.close();

  }
}
